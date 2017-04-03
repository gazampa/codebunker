// Maze.java by Paul Falstad, www.falstad.com
// Copyright (C) 1998, all rights reserved

// XXX have nice sky background for exits
// XXX allow user to hold down movement keys
// XXX default map size should be larger, for speed

import java.io.InputStream;
import java.awt.*;
import java.awt.image.ImageProducer;
import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;
import java.io.File;
import java.net.URL;
import java.util.Random;
import java.awt.image.MemoryImageSource;

class FloatPair {
    public double p1, p2;
    FloatPair(double pp1, double pp2) {
	p1 = pp1;
	p2 = pp2;
    }
}

class RangePair {
    public int x1, z1, x2, z2;
    RangePair(int xx1, int zz1, int xx2, int zz2) {
	x1 = xx1;
	z1 = zz1;
	x2 = xx2;
	z2 = zz2;
    }
}

class Seg {
    public int x, y, dx, dy, dist;
    public Color col;
    public boolean partition, seen;
    Seg(int psx, int psy, int pdx, int pdy, int cl, int cc) {
	x = psx;
	y = psy;
	dx = pdx;
	dy = pdy;
	dist = cl;
	seen = false;
	cl /= 4;
	int add = (dx != 0) ? 1 : 0;
	int part1 = cl & 7;
	int part2 = ((cl >> 3) ^ cc) % 6;
	int val1 = ((part1 + 2 + add) * 70)/8 + 80;
	switch (part2) {
	case 0: col = new Color(val1, 20, 20); break;
	case 1: col = new Color(20, val1, 20); break;
	case 2: col = new Color(20, 20, val1); break;
	case 3: col = new Color(val1, val1, 20); break;
	case 4: col = new Color(20, val1, val1); break;
	case 5: col = new Color(val1, 20, val1); break;
	}
    }
    int GetDir() {
	if (dx != 0)
	    return (dx < 0) ? 1 : -1;
	return (dy < 0) ? 2 : -2;
    }
}

class BSPNode {
    public int xl, yl, xu, yu;
    public boolean isleaf;
}

class BSPLeaf extends BSPNode {
    Vector slist;
    void fix_bounds(int x, int y) {
	xl = Math.min(xl, x);
	yl = Math.min(yl, y);
	xu = Math.max(xu, x);
	yu = Math.max(yu, y);
    }

    BSPLeaf(Vector sl) {
	slist = sl;
	xl = yl =  1000000;
	xu = yu = -1000000;
	isleaf = true;
	for (int i = 0; i != sl.size(); i++) {
	    Seg se = (Seg) slist.elementAt(i);
	    fix_bounds(se.x, se.y);
	    fix_bounds(se.x + se.dx, se.y + se.dy);
	}
    }

}

class BSPBranch extends BSPNode {
    BSPNode lbranch, rbranch;
    int x, y, dx, dy;
    BSPBranch(int px, int py, int pdx, int pdy, BSPNode l, BSPNode r) {
	lbranch = l;
	rbranch = r;
	isleaf = false;
	x = px; y = py; dx = pdx; dy = pdy;
	xl = Math.min(l.xl, r.xl);
	xu = Math.max(l.xu, r.xu);
	yl = Math.min(l.yl, r.yl);
	yu = Math.max(l.yu, r.yu);
    }
}

public class Maze extends Applet {
    static final int view_width = 400;
    static final int view_height = 400;
    int zscale = view_height/2;

    static final int map_unit = 128;
    static final int view_offset = map_unit/8;
    static final int step_size = map_unit/4;

    RangeSet rset;
    Graphics gc;

    Image buffer_img;
    int state;
    static final int STATE_TITLE = 1;
    static final int STATE_GENERATING = 2;
    static final int STATE_PLAY = 3;
    static final int STATE_FINISH = 4;
    public int percentdone = 0;
    boolean showMaze;
    boolean showSolution;
    boolean solving;

    final int viewz = 50;
    int viewx, viewy, ang;
    int dx, dy;
    int px, py, walk_step;
    int view_dx, view_dy;

    int mazew;
    int mazeh;

    // debug stuff
    boolean deepdebug = false;
    boolean all_visible = false;
    boolean new_game = false;

    int mazecells[][];
    int mazedists[][];
    int seencells[][];
    BSPNode bsp_root;

    public void NewMaze(BSPNode root, int cells[][], int dists[][],
			int startx, int starty) {
	showMaze = showSolution = solving = false;
	mazecells = cells;
	mazedists = dists;
	seencells = new int[mazew+1][mazeh+1];
	bsp_root = root;
	dx = 1; dy = 0;
	px = startx; py = starty;
	walk_step = 0;
	view_dx = dx<<16; view_dy = dy<<16;
	ang = 0;
	map_mode = false;
	map_scale = 10;
	state = STATE_PLAY;
	redraw();
	// the next line is needed because we're in a separate thread;
	// we can't seem to do a real paint in this thread, so tell
	// the main thread to do it.
	repaint();
    }

    void BuildInterrupted() {
	state = STATE_TITLE;
	redraw();
	mazebuilder = null;
    }

    final int viewd_unscale(int x) {
	return x >> 16;
    }

    final double radify(int x) {
	return x*Math.PI/180;
    }

    boolean clipt(int denom, int num, FloatPair fp) {
	if (denom > 0) {
	    double t = num * 1.0 / denom;
	    if (t > fp.p2)
		return false;
	    if (t > fp.p1)
		fp.p1 = t;
	} else if (denom < 0) {
	    double t = num * 1.0 / denom;
	    if (t < fp.p1)
		return false;
	    if (t < fp.p2)
		fp.p2 = t;
	} else if (num > 0)
	    return false;
	return true;
    }

    boolean clip3d(RangePair rp) {
	int x1 = rp.x1, z1 = rp.z1, x2 = rp.x2, z2 = rp.z2;

	if (z1 > -4 && z2 > -4)
	    return false;
	if (x1 > -z1 && x2 > -z2)
	    return false;
	if (-x1 > -z1 && -x2 > -z2)
	    return false;
	int dx = x2-x1;
	int dz = z2-z1;
	FloatPair fp = new FloatPair(0, 1);
	if (!clipt(-dx-dz, x1+z1, fp))
	    return false;
	if (!clipt( dx-dz,-x1+z1, fp))
	    return false;
	if (!clipt(-dz, z1-4, fp))
	    return false;
	if (fp.p2 < 1) {
	    rp.x2 = (int) (x1 + fp.p2*dx);
	    rp.z2 = (int) (z1 + fp.p2*dz);
	}
	if (fp.p1 > 0) {
	    rp.x1 += fp.p1*dx;
	    rp.z1 += fp.p1*dz;
	}
	return true;
    }

    void drawrect(Seg seg, int ox1, int y1, int ox2, int y2) {
	int y11, y12, y21, y22;
	int z1 = 0;
	int z2 = 100;

	drawrect_ct++;
	ox1 -= viewx; y1 -= viewy; z1 -= viewz;
	ox2 -= viewx; y2 -= viewy; z2 -= viewz;
	y11 = y21 = -z1;
	int x1 = -viewd_unscale(view_dy*ox1-view_dx*y1);
	z1 = -viewd_unscale(view_dx*ox1+view_dy*y1);
	y12 = y22 = -z2;
	int x2 = -viewd_unscale(view_dy*ox2-view_dx*y2);
	z2 = -viewd_unscale(view_dx*ox2+view_dy*y2);

	RangePair rp = new RangePair(x1, z1, x2, z2);
	if (!clip3d(rp))
	    return;

	y11 = y11*zscale/rp.z1+(view_height/2);
	y12 = y12*zscale/rp.z1+(view_height/2);
	y21 = y21*zscale/rp.z2+(view_height/2);
	y22 = y22*zscale/rp.z2+(view_height/2);
	x1 = rp.x1*zscale/rp.z1+(view_width/2);
	x2 = rp.x2*zscale/rp.z2+(view_width/2);
	if (x1 >= x2) /* reject backfaces */
	    return;
	int x1i = x1;
	int xd = x2-x1;
	gc.setColor(seg.col);
	boolean drawn = false;
	drawrect_late_ct++;
	while (x1i <= x2) {
	    Point p = new Point(x1i, x2);
	    if (!rset.intersect(p))
		break;
	    x1i = p.x;
	    int x2i = p.y;
	    int xps[] = { x1i, x1i, x2i+1, x2i+1 };
	    int yps[] = { y11+(x1i-x1)*(y21-y11)/xd,
			  y12+(x1i-x1)*(y22-y12)/xd+1,
			  y22+(x2i-x2)*(y22-y12)/xd+1,
			  y21+(x2i-x2)*(y21-y11)/xd };
	    gc.fillPolygon(xps, yps, 4);
	    drawn = true;
	    rset.remove(x1i, x2i);
	    x1i = x2i+1;
	    drawrect_segment_ct++;
	}
	if (drawn && !seg.seen) {
	    int sx = seg.x / map_unit;
	    int sy = seg.y / map_unit;
	    int sdx = seg.dx / map_unit;
	    int sdy = seg.dy / map_unit;
	    int sdsx = MazeBuilder.getSign(sdx);
	    int sdsy = MazeBuilder.getSign(sdy);
	    int len = Math.abs(sdx + sdy);
	    int bit = (sdx != 0) ? MazeBuilder.CW_TOP : MazeBuilder.CW_LEFT;
	    if (sdx < 0)
		sx--;
	    if (sdy < 0)
		sy--;
	    seg.seen = true;
	    for (int i = 0; i != len; i++) {
		seencells[sx][sy] |= bit;
		sx += sdsx;
		sy += sdsy;
	    }
	}
    }

    boolean map_mode;
    int map_scale;

    void redraw() {
	gc = buffer_img.getGraphics();

	// yeah, this is nice and object-oriented
	switch (state) {
	case STATE_TITLE:
	    redraw_title(gc);
	    break;
	case STATE_GENERATING:
	    redraw_generating(gc);
	    break;
	case STATE_PLAY:
	    redraw_play(gc);
	    break;
	case STATE_FINISH:
	    redraw_finish(gc);
	    break;
	}
	update(getGraphics());
    }

    public void centerString(Graphics g, FontMetrics fm,
	  String str, int ypos) {
	g.drawString(str, (view_width-fm.stringWidth(str))/2, ypos);
    }

    void redraw_title(Graphics gc) {
	gc.setColor(Color.white);
	gc.fillRect(0, 0, view_width, view_height);
	gc.setFont(largeBannerFont);
	FontMetrics fm = gc.getFontMetrics();
	gc.setColor(Color.red);
	centerString(gc, fm, "MAZE", 100);
	gc.setColor(Color.blue);
	gc.setFont(smallBannerFont);
	fm = gc.getFontMetrics();
	centerString(gc, fm, "by Paul Falstad", 160);
	centerString(gc, fm, "www.falstad.com", 190);
	gc.setColor(Color.black);
	centerString(gc, fm, "To start, select a skill level.", 250);
	centerString(gc, fm, "(Press a number from 0 to 9,", 300);
	centerString(gc, fm, "or a letter from A to F)", 320);
	centerString(gc, fm, "v1.2", 350);
    }

    void redraw_finish(Graphics gc) {
	gc.setColor(Color.blue);
	gc.fillRect(0, 0, view_width, view_height);
	gc.setFont(largeBannerFont);
	FontMetrics fm = gc.getFontMetrics();
	gc.setColor(Color.yellow);
	centerString(gc, fm, "You won!", 100);
	gc.setColor(Color.orange);
	gc.setFont(smallBannerFont);
	fm = gc.getFontMetrics();
	centerString(gc, fm, "Congratulations!", 160);
	gc.setColor(Color.white);
	centerString(gc, fm, "Hit any key to restart", 300);
    }

    void redraw_generating(Graphics gc) {
	gc.setColor(Color.yellow);
	gc.fillRect(0, 0, view_width, view_height);
	gc.setFont(largeBannerFont);
	FontMetrics fm = gc.getFontMetrics();
	gc.setColor(Color.red);
	centerString(gc, fm, "Building maze", 150);
	gc.setFont(smallBannerFont);
	fm = gc.getFontMetrics();
	gc.setColor(Color.black);
	centerString(gc, fm, percentdone+"% completed", 200);
	centerString(gc, fm, "Hit escape to stop", 300);
    }

    void redraw_play(Graphics gc) {
	viewx = px*map_unit+map_unit/2;
	viewx += viewd_unscale(view_dx*(step_size*walk_step-view_offset));
	viewy = py*map_unit+map_unit/2;
	viewy += viewd_unscale(view_dy*(step_size*walk_step-view_offset));

	gc.setColor(Color.black);
	gc.fillRect(0, 0, view_width, view_height/2);
	gc.setColor(Color.darkGray);
	gc.fillRect(0, view_height/2, view_width, view_height/2);
	gc.setColor(Color.white);
	rset.set(0, view_width-1);
	traverse_node_ct = traverse_ssector_ct =
	    drawrect_ct = drawrect_late_ct = drawrect_segment_ct = 0;
	traverse_node(bsp_root);
	if (map_mode)
	    draw_map(gc);
    }

    public void draw_map(Graphics gc) {
	gc.setColor(Color.white);
	int vx = px*map_unit+map_unit/2;
	vx += viewd_unscale(view_dx*(step_size*walk_step));
	int vy = py*map_unit+map_unit/2;
	vy += viewd_unscale(view_dy*(step_size*walk_step));
	int offx = -vx*map_scale/map_unit + view_width/2;
	int offy = -vy*map_scale/map_unit + view_height/2;
	int xmin = -offx/map_scale;
	int ymin = -offy/map_scale;
	if (xmin < 0) xmin = 0;
	if (ymin < 0) ymin = 0;
	int xmax = (view_width -offx)/map_scale+1;
	int ymax = (view_height-offy)/map_scale+1;
	if (xmax >= mazew)  xmax = mazew;
	if (ymax >= mazeh)  ymax = mazeh;
	for (int y = ymin; y <= ymax; y++)
	    for (int x = xmin; x <= xmax; x++) {
		int nx1 = x*map_scale + offx;
		int ny1 = view_height-1-(y*map_scale + offy);
		int nx2 = x*map_scale + offx + map_scale;
		int ny2 = view_height-1-(y*map_scale + offy + map_scale);
		int cell = seencells[x][y];
		boolean s = ((cell & MazeBuilder.CW_TOP) != 0);
		boolean w = (x >= mazew) ? false : (y < mazeh) ?
		    (mazecells[x][y]   & MazeBuilder.CW_TOP) != 0 :
		    (mazecells[x][y-1] & MazeBuilder.CW_BOT) != 0;
		gc.setColor(s ? Color.white : Color.gray);
		if ((s || showMaze) && w)
		    gc.drawLine(nx1, ny1, nx2, ny1);
		s = ((cell & MazeBuilder.CW_LEFT) != 0);
		w = (y >= mazeh) ? false : (x < mazew) ?
		    (mazecells[x][y]   & MazeBuilder.CW_LEFT) != 0 :
		    (mazecells[x-1][y] & MazeBuilder.CW_RIGHT) != 0;
		gc.setColor(s ? Color.white : Color.gray);
		if ((s || showMaze) && w)
		    gc.drawLine(nx1, ny1, nx1, ny2);
	    }
	if (showSolution) {
	    int sx = px;
	    int sy = py;
	    int d = mazedists[sx][sy];
	    gc.setColor(Color.yellow);
	    while (d > 1) {
		int n;
		for (n = 0; n != 4; n++) {
		    if ((mazecells[sx][sy] & masks[n]) != 0)
			continue;
		    try {
			int dx = MazeBuilder.dirsx[n];
			int dy = MazeBuilder.dirsy[n];
			int dn = mazedists[sx+dx][sy+dy];
			if (dn < d) {
			    int nx1 = sx*map_scale + offx + map_scale/2;
			    int ny1 = view_height-1-(sy*map_scale + offy) -
				map_scale/2;
			    int ndx =  dx * map_scale;
			    int ndy = -dy * map_scale;
			    gc.drawLine(nx1, ny1, nx1+ndx, ny1+ndy);
			    sx += dx;
			    sy += dy;
			    d = dn;
			    break;
			}
		    } catch (Exception e) { }
		}
		if (n == 4)
		    dbg("HELP!");
	    }
	}
	gc.setColor(Color.red);
	int ctrx = view_width/2;
	int ctry = view_height/2;
	int cirsiz = map_scale/2;
	gc.fillOval(ctrx-cirsiz/2, ctry-cirsiz/2, cirsiz, cirsiz);
	int arrlen = 7*map_scale/16;
	int aptx = ctrx + ((arrlen * view_dx) >> 16);
	int apty = ctry - ((arrlen * view_dy) >> 16);
	int arrlen2 = map_scale/4;
	int aptx2 = ctrx + ((arrlen2 * view_dx) >> 16);
	int apty2 = ctry - ((arrlen2 * view_dy) >> 16);
	int ptoflen = map_scale/8;
	int ptofx = -( arrlen2 * view_dy) >> 16;
	int ptofy = -( arrlen2 * view_dx) >> 16;
	gc.drawLine(ctrx, ctry, aptx, apty);
	gc.drawLine(aptx, apty, aptx2 + ptofx, apty2 + ptofy);
	gc.drawLine(aptx, apty, aptx2 - ptofx, apty2 - ptofy);
    }

    public void update(Graphics g) {
	g.drawImage(buffer_img, 0, 0, this);
	if (solving)
	    solveStep();
    }

    public void paint(Graphics g) {
	g.drawImage(buffer_img, 0, 0, this);
    }

    void dbg(String str) {
	System.out.println(str);
    }

    int traverse_node_ct;
    int traverse_ssector_ct;
    int drawrect_ct;
    int drawrect_late_ct;
    int drawrect_segment_ct;

    int nesting = 0;

    void traverse_node(BSPNode nn) {
	traverse_node_ct++;
	if (nn.isleaf) {
	    traverse_ssector((BSPLeaf) nn);
	    return;
	}
	BSPBranch n = (BSPBranch) nn;
	if (deepdebug) {
	    dbg("                               ".substring(0, nesting) +
		"traverse_node "+n.x+" "+n.y+" "+n.dx+" "+n.dy+" "+
		n.xl+" "+n.yl+" "+n.xu+" "+n.yu);
	}
	nesting++;
	int dot = (viewx-n.x)*n.dy-(viewy-n.y)*n.dx;
	BSPNode lch = n.lbranch;
	BSPNode rch = n.rbranch;
	if (dot >= 0) {
	    if (bbox_visible(rch.yu, rch.yl, rch.xl, rch.xu))
		traverse_node(rch);
	}
	if (bbox_visible(lch.yu, lch.yl, lch.xl, lch.xu))
	    traverse_node(lch);
	if (dot < 0) {
	    if (bbox_visible(rch.yu, rch.yl, rch.xl, rch.xu))
		traverse_node(rch);
	}
	nesting--;
    }

    boolean bbox_visible(int ymax, int ymin, int xmin, int xmax) {
	int rp1x, rp1z;
	int rp2x, rp2z;
	int p1x, p1y, p2x, p2y, x1, x2;

	if (all_visible)
	    return true;
	if (rset.isEmpty())
	    return false;
	if (ang >= 45 && ang <= 135 && viewy > ymax)
	    return false;
	if (ang >= 225 && ang <= 315 && viewy < ymin)
	    return false;
	if (ang >= 135 && ang <= 225 && viewx < xmin)
	    return false;
	if ((ang >= 315 || ang <= 45) && viewx > xmax)
	    return false;
	xmin -= viewx;
	ymin -= viewy;
	xmax -= viewx;
	ymax -= viewy;
	p1x = xmin; p2x = xmax;
	p1y = ymin; p2y = ymax;
	if (ymin < 0 && ymax > 0) {
	    p1y = ymin; p2y = ymax;
	    if (xmin < 0) {
		if (xmax > 0)
		    return true;
		p1x = p2x = xmax;
	    } else
		p1x = p2x = xmin;
	} else if (xmin < 0 && xmax > 0) {
	    if (ymin < 0)
		p1y = p2y = ymax;
	    else
		p1y = p2y = ymin;
	} else if ((xmin > 0 && ymin > 0) || (xmin < 0 && ymin < 0)) {
	    p1x = xmax; p2x = xmin;
	}
	rp1x = -viewd_unscale(view_dy*p1x-view_dx*p1y);
	rp1z = -viewd_unscale(view_dx*p1x+view_dy*p1y);
	rp2x = -viewd_unscale(view_dy*p2x-view_dx*p2y);
	rp2z = -viewd_unscale(view_dx*p2x+view_dy*p2y);
	RangePair rp = new RangePair(rp1x, rp1z, rp2x, rp2z);
	if (!clip3d(rp))
	    return false;
	x1 = rp.x1*zscale/rp.z1+(view_width/2);
	x2 = rp.x2*zscale/rp.z2+(view_width/2);
	if (x1 > x2) {
	    int xj = x1;
	    x1 = x2;
	    x2 = xj;
	}
	Point p = new Point(x1, x2);
	return (rset.intersect(p));
    }

    void traverse_ssector(BSPLeaf n) {
	Vector sl = n.slist;
	traverse_ssector_ct++;
	if (deepdebug) {
	    dbg("                               ".substring(0, nesting) +
		"traverse_ssector "+n.xl+" "+n.yl+" "+n.xu+" "+n.yu);
	}
	for (int i = 0; i != sl.size(); i++) {
	    Seg seg = (Seg) sl.elementAt(i);
	    int v1x = seg.x;
	    int v1y = seg.y;
	    int v2x = v1x+seg.dx;
	    int v2y = v1y+seg.dy;
	    if (deepdebug) {
		dbg("                               ".substring(0, nesting) +
		    " traverse_ssector("+i+") "+v1x+" "+v1y+" "+
		    seg.dx+" "+seg.dy);
	    }
	    drawrect(seg, v1x, v1y, v2x, v2y);
	}
    }

    public static int masks[] = {
	MazeBuilder.CW_RIGHT, MazeBuilder.CW_BOT,
	MazeBuilder.CW_LEFT,  MazeBuilder.CW_TOP
    };

    boolean check_move(int dir) {
	int a = ang/90;

	if (dir == -1)
	    a = (a+2) & 3;
	return (mazecells[px][py] & masks[a]) == 0;
    }

    void rotate_step() {
	ang = (ang+1800) % 360;
	view_dx = (int) (Math.cos(radify(ang))*(1<<16));
	view_dy = (int) (Math.sin(radify(ang))*(1<<16));
	move_step();
    }

    void move_step() {
	redraw();
	try {
	    Thread.currentThread().sleep(25);
	} catch (Exception e) { }
    }

    void rotate_finish() {
	dx = (int) Math.cos(radify(ang));
	dy = (int) Math.sin(radify(ang));
	log_position();
    }

    void walk_finish(int dir) {
	px += dir*dx; py += dir*dy;
	if (px < 0 || py < 0 || px >= mazew || py >= mazeh) {
	    state = STATE_FINISH;
	    redraw();
	}
	walk_step = 0;
	log_position();
    }

    void log_position() {
	if (!deepdebug)
	    return;
	dbg("x="+viewx/map_unit+" ("+
	    viewx+") y="+viewy/map_unit+" ("+viewy+") ang="+
	    ang+" dx="+dx+" dy="+dy+" "+view_dx+" "+view_dy);
    }

    synchronized void walk(int dir) {
	if (!check_move(dir))
	    return;
	for (int step = 0; step != 4; step++) {
	    walk_step += dir;
	    move_step();
	}
	walk_finish(dir);
    }

    synchronized void rotate(int dir) {
	int origang = ang;
	int steps = 4;

	for (int step = 0; step != steps; step++) {
	    ang = origang + dir*(90*(step+1))/steps;
	    rotate_step();
	}
	rotate_finish();
    }

    void rotateTo(int n) {
	int a = ang/90;
	if (n == a)
	    ;
	else if (n == ((a+2) & 3)) {
	    rotate(1);
	    rotate(1);
	} else if (n == ((a+1) & 3)) {
	    rotate(1);
	} else
	    rotate(-1);
    }

    synchronized void solveStep() {
	solving = false;
	int d = mazedists[px][py];
	gc.setColor(Color.yellow);
	if (d > 1) {
	    int n;
	    for (n = 0; n != 4; n++) {
		if ((mazecells[px][py] & masks[n]) != 0)
		    continue;
		try {
		    int dx = MazeBuilder.dirsx[n];
		    int dy = MazeBuilder.dirsy[n];
		    int dn = mazedists[px+dx][py+dy];
		    if (dn < d)
			break;
		} catch (Exception e) { }
	    }
	    if (n == 4)
		dbg("HELP!");
	    rotateTo(n);
	    walk(1);
	    repaint(25);
	    solving = true;
	    return;
	}
	int n;
	for (n = 0; n != 4; n++) {
	    if ((mazecells[px][py] & masks[n]) > 0)
		continue;
	    int dx = MazeBuilder.dirsx[n];
	    int dy = MazeBuilder.dirsy[n];
	    if (px+dx < 0 || px+dx >= mazew ||
		py+dy < 0 || py+dy >= mazeh)
		break;
	}
	rotateTo(n);
	walk(1);
    }

    public MazeBuilder mazebuilder;
    final int ESCAPE = 27;

    public boolean keyDown(Event evt, int key) {
	switch (state) {
	case STATE_TITLE:
	    if (key >= '0' && key <= '9') {
		Build(key - '0');
		break;
	    }
	    if (key >= 'a' && key <= 'f') {
		Build(key - 'a' + 10);
		break;
	    }
	    break;
	case STATE_GENERATING:
	    if (key == ESCAPE) {
		mazebuilder.Interrupt();
		BuildInterrupted();
	    }
	    break;
	case STATE_PLAY:
	    switch (key) {
	    case Event.UP: case 'k': case '8':
                walk(1);
                break;
	    case Event.LEFT: case 'h': case '4':
                rotate(1);
                break;
	    case Event.RIGHT: case 'l': case '6':
                rotate(-1);
                break;
	    case Event.DOWN: case 'j': case '2':
                walk(-1);
                break;
	    case ESCAPE: case 65385:
		if (solving)
		    solving = false;
		else
		    state = STATE_TITLE;
		redraw();
		break;
	    case ('w' & 0x1f): px += dx; py += dy; redraw(); break;
	    case '\t': case 'm':
		map_mode = !map_mode; redraw(); break;
	    case 'z':
		showMaze = !showMaze; redraw(); break;
	    case 's':
		showSolution = !showSolution; redraw(); break;
	    case ('s' & 0x1f):
		if (solving)
		    solving = false;
		else {
		    solving = true;
		    repaint(25);
		}
		break;
	    case '+': case '=':
		map_scale++; redraw(); break;
	    case '-':
		map_scale--;
		if (map_scale < 1)
		    map_scale = 1;
		redraw();
		break;
	    }
	    break;
	case STATE_FINISH:
	    state = STATE_TITLE;
	    redraw();
	    break;
	}
	return true;
    }

    Font smallBannerFont, largeBannerFont;

    public void init() {
	state = STATE_TITLE;
	buffer_img = createImage(view_width, view_height);
	rset = new RangeSet();
	largeBannerFont = new Font("TimesRoman", Font.BOLD, 48);
	smallBannerFont = new Font("TimesRoman", Font.BOLD, 16);
	// force MazeBuilder to load; if we load it later, it takes
	// FOREVER, using Netscape 2.0b5 on Windows NT
	MazeBuilder mbjunk = new MazeBuilder();
	FloatPair fpjunk = new FloatPair(0.0, 0.0);
	RangePair rpjunk = new RangePair(0, 0, 0, 0);
	Seg sgjunk = new Seg(0, 0, 0, 0, 0, 0);
	RangeSetElement rsejunk = new RangeSetElement(0, 0);
    }

    public void start() {
	redraw();
    }

    public void stop() {
    }

    static int skill_x[] =     { 4, 12, 15, 20, 25, 25, 35, 35, 40, 60,
                                 70, 80, 90, 110, 150, 300 };
    static int skill_y[] =     { 4, 12, 15, 15, 20, 25, 25, 35, 40, 60,
    	   			 70, 75, 75,  90, 120, 240 };
    static int skill_rooms[] = { 0,  2,  2,  3,  4,  5, 10, 10, 20, 45,
                                 45, 50, 50,  60,  80, 160 };
    static int skill_partct[] = { 60,
				  600, 900, 1200,
				  2100, 2700, 3300,
				  5000, 6000, 13500,
                                  19800, 25000, 29000,
				  45000, 85000, 85000*4 };

    public void Build(int skill) {
	state = STATE_GENERATING;
	percentdone = 0;
	redraw();
	mazebuilder = new MazeBuilder();
	mazew = skill_x[skill];
	mazeh = skill_y[skill];
	int roomcount = skill_rooms[skill];
	mazebuilder.Build(this, mazew, mazeh, roomcount, skill_partct[skill]);
    }
}

class RangeSetElement {
    public int min, max;
    RangeSetElement(int mn, int mx) {
	min = mn;
	max = mx;
    }
}

class RangeSet {
    Vector ranges;
    RangeSet() {
	ranges = new Vector();
    }

    public boolean isEmpty() {
	return ranges.isEmpty();
    }

    public void set(int mn, int mx) {
	ranges.removeAllElements();
	ranges.addElement(new RangeSetElement(mn, mx));
    }

    public void remove(int fx, int tx) {
	if (tx < fx) {
	    int jj = tx;
	    tx = fx;
	    fx = jj;
	}
	for (int i = 0; i != ranges.size(); i++) {
	    RangeSetElement rse =
		(RangeSetElement) ranges.elementAt(i);
	    if (rse.max < fx)
		continue;
	    if (rse.min > tx)
		return;
	    if (fx <= rse.min) {
		if (rse.max <= tx) {
		    ranges.removeElementAt(i--);
		    continue;
		}
		rse.min = tx+1;
		return;
	    }
	    if (fx <= rse.max && tx >= rse.max) {
		rse.max = fx-1;
		continue;
	    }
	    RangeSetElement nrse = new RangeSetElement(rse.min, fx-1);
	    ranges.insertElementAt(nrse, i);
	    rse.min = tx+1;
	    return;
	}
    }

    // "p" isn't (strictly speaking) a point, but I need to return two
    // values here, and can't find a nicer way to do it.
    public boolean intersect(Point p) {
	int min = p.x;
	int max = p.y;
	for (int i = 0; i != ranges.size(); i++) {
	    RangeSetElement rse =
		(RangeSetElement) ranges.elementAt(i);
	    if (rse.max < min)
		continue;
	    if (rse.min > max)
		return false;
	    if (rse.min > min)
		p.x = rse.min;
	    if (rse.max < max)
		p.y = rse.max;
	    return true;
	}
	return false;
    }
}

// things we need to get from Maze: width, height
// things we need to return to Maze: root node, mazecells array
// create a MazeBuilder, call Build(Maze, width, height);
//   it will call Maze.NewMaze(root node, mazecells array)

class MazeBuilder implements Runnable {
    public static final int CW_TOP = 1;
    public static final int CW_BOT = 2;
    public static final int CW_LEFT = 4;
    public static final int CW_RIGHT = 8;
    static final int CW_VIRGIN = 16;
    public static final int CW_ALL = CW_TOP|CW_BOT|CW_LEFT|CW_RIGHT;
    static final int CW_BOUND_SHIFT = 5;
    static final int CW_TOP_BOUND = 32;
    static final int CW_BOT_BOUND = 64;
    static final int CW_LEFT_BOUND = 128;
    static final int CW_RIGHT_BOUND = 256;
    static final int CW_ALL_BOUNDS =
	CW_TOP_BOUND|CW_BOT_BOUND|CW_LEFT_BOUND|CW_RIGHT_BOUND;
    static final int CW_IN_ROOM = 512;

    public static int dirsx[] = { 1, 0, -1, 0 };
    public static int dirsy[] = { 0, 1, 0, -1 };
    int width, height, startx, starty;
    int cells[][], origdirs[][], dists[][];

    boolean can_go(int x, int y, int dx, int dy) {
	int bit = get_bit(dx, dy) << CW_BOUND_SHIFT;
	if ((cells[x][y] & bit) != 0)
	    return false;
	return (cells[x+dx][y+dy] & CW_VIRGIN) != 0;
    }

    int get_bit(int dx, int dy) {
	int bit = 0;
	switch (dx + dy * 2) {
	case 1:  bit = CW_RIGHT; break;
	case -1: bit = CW_LEFT;  break;
	case 2:  bit = CW_BOT;   break;
	case -2: bit = CW_TOP;   break;
	default: dbg("get_bit problem "+dx+" "+dy); break;
	}
	return bit;
    }

    Random random;
    Maze maze;

    int randno(int lo, int hi) {
	return (Math.abs(random.nextInt()) % (hi-lo+1)) + lo;
    }

    void delwall(int x, int y, int dx, int dy) {
	int bit;
	bit = get_bit(dx, dy);
	cells[x][y] &= ~bit;
	bit = get_bit(-dx, -dy);
	cells[x+dx][y+dy] &= ~bit;
    }

    void delbound(int x, int y, int dx, int dy) {
	int bit;
	bit = get_bit(dx, dy);
	cells[x][y] &= ~(bit << CW_BOUND_SHIFT);
	bit = get_bit(-dx, -dy);
	cells[x+dx][y+dy] &= ~(bit << CW_BOUND_SHIFT);
    }

    void addboundwall(int x, int y, int dx, int dy) {
	int bit = get_bit(dx, dy);
	cells[x][y] |= bit | (bit<<CW_BOUND_SHIFT);
	int bit2 = get_bit(-dx, -dy);
	cells[x+dx][y+dy] |= bit2 | (bit2<<CW_BOUND_SHIFT);
    }

    int partiters = 0;

    int grade_partition(Vector sl, Seg pe) {
	int x  = pe.x;
	int y  = pe.y;
	int dx = pe.dx;
	int dy = pe.dy;
	int lcount = 0, rcount = 0, splits = 0;
	int inc = 1;
	if (sl.size() >= 100)
	    inc = sl.size() / 50;
	for (int i = 0; i < sl.size(); i += inc) {
	    Seg se = (Seg) sl.elementAt(i);
	    int df1x = se.x-x;
	    int df1y = se.y-y;
	    int sendx = se.x + se.dx;
	    int sendy = se.y + se.dy;
	    int df2x = sendx - x;
	    int df2y = sendy - y;
	    int nx = dy;
	    int ny = -dx;
	    int dot1 = df1x * nx + df1y * ny;
	    int dot2 = df2x * nx + df2y * ny;
	    if (getSign(dot1) != getSign(dot2)) {
		if (dot1 == 0)
		    dot1 = dot2;
		else if (dot2 != 0) {
		    splits++;
		    continue;
		}
	    }
	    if (dot1 > 0 ||
		       (dot1 == 0 && se.GetDir() ==  pe.GetDir())) {
		rcount++;
	    } else if (dot1 < 0 ||
		       (dot1 == 0 && se.GetDir() == -pe.GetDir())) {
		lcount++;
	    } else {
		dbg("grade_partition problem: dot1 = "+dot1+", dot2 = "+dot2);
	    }
	}
	return Math.abs(lcount-rcount) + splits * 3;
    }

    Vector seglist;
    static int getSign(int num) {
	return (num < 0) ? -1 : (num > 0) ? 1 : 0;
    }
    void Initialize() {
	int x, y;

	for (x = 0; x != width; x++) {
	    for (y = 0; y != height; y++) {
		cells[x][y] = CW_VIRGIN | CW_ALL;
	    }
	    cells[x][0] |= CW_TOP_BOUND;
	    cells[x][height-1] |= CW_BOT_BOUND;
	}
	for (y = 0; y != height; y++) {
	    cells[0][y] |= CW_LEFT_BOUND;
	    cells[width-1][y] |= CW_RIGHT_BOUND;
	}
    }

    void Generate() {
	int x, y;

	y = 0;
	int firstx = x = randno(0, width-1);
	int dir = 0;
	int origdir = dir;
	cells[x][y] &= ~CW_VIRGIN;
	while (true) {
	    int dx = dirsx[dir], dy = dirsy[dir];
	    if (!can_go(x, y, dx, dy)) {
		dir = (dir+1) & 3;
		if (origdir == dir) {
		    if (x == firstx && y == 0)
			break;
		    int odr = origdirs[x][y];
		    dx = dirsx[odr];
		    dy = dirsy[odr];
		    x -= dx;
		    y -= dy;
		    origdir = dir = randno(0, 3);
		}
	    } else {
		delwall(x, y, dx, dy);
		x += dx;
		y += dy;
		cells[x][y] &= ~CW_VIRGIN;
		origdirs[x][y] = dir;
		origdir = dir = randno(0, 3);
	    }
	}

	// find most remote point in maze
	computeDists(width/2, height/2);
	int remotex = -1, remotey = -1, remotedist = 0;
	for (x = 0; x != width; x++) {
	    if (dists[x][0] > remotedist) {
		remotex = x;
		remotey = 0;
		remotedist = dists[x][0];
	    }
	    if (dists[x][height-1] > remotedist) {
		remotex = x;
		remotey = height-1;
		remotedist = dists[x][height-1];
	    }
	}
	for (y = 0; y != height; y++) {
	    if (dists[0][y] > remotedist) {
		remotex = 0;
		remotey = y;
		remotedist = dists[0][y];
	    }
	    if (dists[width-1][y] > remotedist) {
		remotex = width-1;
		remotey = y;
		remotedist = dists[width-1][y];
	    }
	}

	computeDists(remotex, remotey);

	int d = 0;
	for (x = 0; x != width; x++)
	    for (y = 0; y != height; y++) {
		if (dists[x][y] > d) {
		    startx = x;
		    starty = y;
		    d = dists[x][y];
		}
	    }

	int bit = 0;
	if (remotex == 0)
	    bit = CW_LEFT;
	else if (remotex == width-1)
	    bit = CW_RIGHT;
	else if (remotey == 0)
	    bit = CW_TOP;
	else if (remotey == height-1)
	    bit = CW_BOT;
	else
	    dbg("Generate 1");
	cells[remotex][remotey] &= ~bit;
    }

    void computeDists(int ax, int ay) {
	int x, y;
	int inf = 99999999;
	for (x = 0; x != width; x++)
	    for (y = 0; y != height; y++)
		dists[x][y] = inf;
	dists[ax][ay] = 1;
	boolean done;

	do {
	    done = true;
	    for (x = 0; x != width; x++)
		for (y = 0; y != height; y++) {
		    int sx = x;
		    int sy = y;
		    int d = dists[sx][sy];
		    if (d == inf) {
			done = false;
			continue;
		    }
		    int run = 0;
		    while (true) {
			int n, nextn = -1;
			int c = cells[sx][sy];
			for (n = 0; n != 4; n++) {
			    int nx = sx+dirsx[n];
			    int ny = sy+dirsy[n];
			    if ((c & Maze.masks[n]) == 0 &&
				   dists[nx][ny] > d+1) {
				dists[nx][ny] = d+1;
				nextn = n;
			    }
			}
			run++;
			if (nextn == -1)
			    break;
			sx += dirsx[nextn];
			sy += dirsy[nextn];
			d++;
		    }
		}
	} while (!done);
    }

    boolean PlaceRoom() {
	int rw = randno(3, 8);
	int rh = randno(3, 8);
	if (rw >= width-4)
	    return false;
	if (rh >= height-4)
	    return false;
	int rx = randno(1, width-rw-1);
	int ry = randno(1, height-rh-1);
	int rxl = rx+rw-1;
	int ryl = ry+rh-1;
	int x, y;
	for (x = rx-1; x <= rxl+1; x++)
	    for (y = ry-1; y <= ryl+1; y++)
		if ((cells[x][y] & CW_IN_ROOM) != 0)
		    return false;
	for (x = rx; x <= rxl; x++)
	    for (y = ry; y <= ryl; y++) {
		cells[x][y] &= ~CW_ALL;
		cells[x][y] |= CW_IN_ROOM;
	    }
	for (x = rx; x <= rxl; x++) {
	    addboundwall(x, ry, 0, -1);
	    addboundwall(x, ryl, 0, 1);
	}
	for (y = ry; y <= ryl; y++) {
	    addboundwall(rx, y, -1, 0);
	    addboundwall(rxl, y, 1, 0);
	}
	int wallct = (rw+rh)*2;
	int ct;
	for (ct = 0; ct != 5; ct++) {
	    int door = randno(0, wallct-1);
	    int dx, dy;
	    if (door < rw*2) {
		y = (door < rw) ? 0 : rh-1;
		dy = (door < rw) ? -1 : 1;
		x = door % rw;
		dx = 0;
	    } else {
		door -= rw*2;
		x = (door < rh) ? 0 : rw-1;
		dx = (door < rh) ? -1 : 1;
		y = door % rh;
		dy = 0;
	    }
	    delbound(x+rx, y+ry, dx, dy);
	}
	return true;
    }

    static final int map_unit = 128;
    int colchange;

    void GenSegs() {
	int x, y;
	Vector sl = new Vector();

	for (y = 0; y != height; y++) {
	    x = 0;
	    while (x < width) {
		if ((cells[x][y] & CW_TOP) == 0) {
		    x++;
		    continue;
		}
		int startx = x;
		while ((cells[x][y] & CW_TOP) != 0) {
		    x++;
		    if (x == width)
			break;
		    if ((cells[x][y] & CW_LEFT) != 0)
			break;
		}
		sl.addElement(new Seg(x*map_unit, y*map_unit,
		    (startx-x)*map_unit, 0, dists[startx][y], colchange));
	    }
	    x = 0;
	    while (x < width) {
		if ((cells[x][y] & CW_BOT) == 0) {
		    x++;
		    continue;
		}
		int startx = x;
		while ((cells[x][y] & CW_BOT) != 0) {
		    x++;
		    if (x == width)
			break;
		    if ((cells[x][y] & CW_LEFT) != 0)
			break;
		}
		sl.addElement(new Seg(startx*map_unit, (y+1)*map_unit,
		    (x-startx)*map_unit, 0,
		    dists[startx][y], colchange));
	    }
	}
	for (x = 0; x != width; x++) {
	    y = 0;
	    while (y < height) {
		if ((cells[x][y] & CW_LEFT) == 0) {
		    y++;
		    continue;
		}
		int starty = y;
		while ((cells[x][y] & CW_LEFT) != 0) {
		    y++;
		    if (y == height)
			break;
		    if ((cells[x][y] & CW_TOP) != 0)
			break;
		}
		sl.addElement(new Seg(x*map_unit, starty*map_unit,
		    0, (y-starty)*map_unit,
		    dists[x][starty], colchange));
	    }
	    y = 0;
	    while (y < height) {
		if ((cells[x][y] & CW_RIGHT) == 0) {
		    y++;
		    continue;
		}
		int starty = y;
		while ((cells[x][y] & CW_RIGHT) != 0) {
		    y++;
		    if (y == height)
			break;
		    if ((cells[x][y] & CW_TOP) != 0)
			break;
		}
		sl.addElement(new Seg((x+1)*map_unit, y*map_unit,
		    0, (starty-y)*map_unit,
		    dists[x][starty], colchange));
	    }
	}
	seglist = sl;
	for (int i = 0; i != sl.size(); i++) {
	    Seg se = (Seg) sl.elementAt(i);
	    if (((se.x == 0 || se.x == width ) && se.dx == 0) ||
		    ((se.y == 0 || se.y == height) && se.dy == 0))
		se.partition = true;
	}
	cells[0][0] |= CW_TOP;
    }

    BSPNode GenNodes() {
	return GenNodes(seglist);
    }

    BSPNode GenNodes(Vector sl) {
	int nonparts = 0;
	for (int i = 0; i != sl.size(); i++)
	    if (!((Seg) sl.elementAt(i)).partition)
		nonparts++;
	if (nonparts == 0)
	    return new BSPLeaf(sl);
	int bestgrade = 5000;
	int maxtries = 50;
	Seg pe = null;
	int skip = (sl.size() / maxtries);
	if (skip == 0)
	    skip = 1;
	for (int i = 0; i < sl.size(); i += skip) {
	    Seg pk = (Seg) sl.elementAt(i);
	    if (pk.partition)
		continue;
	    partiters++;
	    if ((partiters & 31) == 0) {
		int pc = partiters*100/expected_partiters;
		if (pc > maze.percentdone && pc < 100) {
    		    maze.percentdone = pc;
		    maze.redraw();
		    maze.repaint();
		    // give Netscrape a chance to process keyboard events
		    try {
			Thread.currentThread().sleep(10);
		    } catch (Exception e) { }
		}
	    }
	    int grade = grade_partition(sl, pk);
	    if (grade < bestgrade) {
		bestgrade = grade;
		pe = pk;
	    }
	}
	pe.partition = true;
	int x  = pe.x;
	int y  = pe.y;
	int dx = pe.dx;
	int dy = pe.dy;
	Vector lsl, rsl;
	lsl = new Vector();
	rsl = new Vector();
	for (int i = 0; i != sl.size(); i++) {
	    Seg se = (Seg) sl.elementAt(i);
	    int df1x = se.x - x;
	    int df1y = se.y - y;
	    int sendx = se.x + se.dx;
	    int sendy = se.y + se.dy;
	    int df2x = sendx - x;
	    int df2y = sendy - y;
	    int nx = dy;
	    int ny = -dx;
	    int dot1 = df1x * nx + df1y * ny;
	    int dot2 = df2x * nx + df2y * ny;
	    if (getSign(dot1) != getSign(dot2)) {
		if (dot1 == 0)
		    dot1 = dot2;
		else if (dot2 != 0) {
		    // we need to split this
		    int spx = se.x;
		    int spy = se.y;
		    if (dx == 0)
			spx = x;
		    else
			spy = y;
		    Seg sps1 = new Seg(se.x, se.y,
			spx-se.x, spy-se.y, se.dist, colchange);
		    Seg sps2 = new Seg(spx, spy, sendx-spx, sendy-spy,
			se.dist, colchange);
		    if (dot1 > 0) {
			rsl.addElement(sps1);
			lsl.addElement(sps2);
		    } else {
			rsl.addElement(sps2);
			lsl.addElement(sps1);
		    }
		    sps1.partition = sps2.partition = se.partition;
		    continue;
		}
	    }
	    if (dot1 > 0 || (dot1 == 0 && se.GetDir() == pe.GetDir())) {
		rsl.addElement(se);
		if (dot1 == 0)
		    se.partition = true;
	    } else if (dot1 < 0 ||
		       (dot1 == 0 && se.GetDir() == -pe.GetDir())) {
		lsl.addElement(se);
		if (dot1 == 0)
		    se.partition = true;
	    } else {
		dbg("error xx 1 "+dot1);
	    }
	}
	if (lsl.size() == 0)
	    return new BSPLeaf(rsl);
	if (rsl.size() == 0)
	    return new BSPLeaf(lsl);
	return new BSPBranch(x, y, dx, dy, GenNodes(lsl), GenNodes(rsl));
    }

    void dbg(String str) {
	System.out.println("MazeBuilder: "+str);
    }

    Thread buildThread;
    int rooms;
    int expected_partiters;

    void Build(Maze mz, int w, int h, int roomct, int pc) {
	random = new Random();
	width = w;
	height = h;
	maze = mz;
	rooms = roomct;
	cells = new int[w][h];
	origdirs = new int[w][h];
	dists = new int[w][h];
	expected_partiters = pc;

	buildThread = new Thread(this);
	buildThread.start();
    }

    public void run() {
	int tries = 250;
	maze.redraw();
	maze.repaint();
	colchange = randno(0, 255);
	Initialize();
	while (tries > 0 && rooms > 0) {
	    if (PlaceRoom())
		rooms--;
	    else
		tries--;
	}

	Generate();
	GenSegs();
	partiters = 0;
	BSPNode root = GenNodes();
	// dbg("partiters = "+partiters);
	maze.NewMaze(root, cells, dists, startx, starty);
    }

    public void Interrupt() {
	buildThread.stop();
    }
}


/**
Use the following keys to move:
Key(s) Action
UP ARROW, 8, k move forward
LEFT ARROW, 4, h turn left
RIGHT ARROW, 6, l turn right
DOWN ARROW, 2, j move backward
m, TAB toggle automap (TAB doesn't work on some browsers)
ESCAPE start over
+ enlarge automap
- shrink automap
s show solution on automap
z show entire maze on automap
Control-s solve maze (hit ESCAPE to stop)

<applet code=Maze.class archive=maze.jar width=400 height=400>
Sorry, you need a Java-enabled browser to play Maze.
I'm not aware of a Java browser for Windows 3.11, but if
you're running UNIX, Mac, or 32-bit Windows, the latest version of
<a href="http://www.netscape.com">Netscape</a> will support Java.
</applet>


**/