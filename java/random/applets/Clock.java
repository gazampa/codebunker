/*
 * @(#)Clock.java	1.7 00/08/10
 *
 * Copyright (c) 1997, 1998 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Sun grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to Sun.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facilit. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes.
 */

import java.util.*;
import java.awt.*;
import java.applet.*;
import java.text.*;

/**
 * Time!
 *
 * @author Rachel Gollub
 * @modified Daniel Peek replaced circle drawing calculation, few more changes
 */
public class Clock extends Applet implements Runnable {
    private volatile Thread timer;       // The thread that displays clock
    private int lastxs, lastys, lastxm,
                lastym, lastxh, lastyh;  // Dimensions used to draw hands
    private SimpleDateFormat formatter;  // Formats the date displayed
    private String lastdate;             // String to hold date displayed
    private Font clockFaceFont;          // Font for number display on clock
    private Date currentDate;            // Used to get date to display
    private Color handColor;             // Color of main hands and dial
    private Color numberColor;           // Color of second hand and numbers

    public void init() {
        int x,y;
        lastxs = lastys = lastxm = lastym = lastxh = lastyh = 0;
        formatter = new SimpleDateFormat ("EEE MMM dd hh:mm:ss yyyy",
                                          Locale.getDefault());
        currentDate = new Date();
        lastdate = formatter.format(currentDate);
        clockFaceFont = new Font("Serif", Font.PLAIN, 14);
        handColor = Color.blue;
        numberColor = Color.darkGray;

        try {
            setBackground(new Color(Integer.parseInt(getParameter("bgcolor"),
                                                     16)));
        } catch (NullPointerException e) {
        } catch (NumberFormatException e) {
        }
        try {
            handColor = new Color(Integer.parseInt(getParameter("fgcolor1"),
                                                   16));
        } catch (NullPointerException e) {
        } catch (NumberFormatException e) {
        }
        try {
            numberColor = new Color(Integer.parseInt(getParameter("fgcolor2"),
                                                     16));
        } catch (NullPointerException e) {
        } catch (NumberFormatException e) {
        }
        resize(300,300);              // Set clock window size
    }

    // Paint is the main part of the program
    public void paint(Graphics g) {
        int xh, yh, xm, ym, xs, ys;
        int s = 0, m = 10, h = 10;
        int xcenter = 80, ycenter = 55;
        String today;

        currentDate = new Date();

        formatter.applyPattern("s");
        try {
            s = Integer.parseInt(formatter.format(currentDate));
        } catch (NumberFormatException n) {
            s = 0;
        }
        formatter.applyPattern("m");
        try {
            m = Integer.parseInt(formatter.format(currentDate));
        } catch (NumberFormatException n) {
            m = 10;
        }
        formatter.applyPattern("h");
        try {
            h = Integer.parseInt(formatter.format(currentDate));
        } catch (NumberFormatException n) {
            h = 10;
        }

        // Set position of the ends of the hands
        xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 45 + xcenter);
        ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 45 + ycenter);
        xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 40 + xcenter);
        ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 40 + ycenter);
        xh = (int) (Math.cos((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 30
                   + xcenter);
        yh = (int) (Math.sin((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 30
                   + ycenter);

        // Draw the circle and numbers
        g.setFont(clockFaceFont);
        g.setColor(handColor);
        g.drawArc(xcenter-50, ycenter-50, 100, 100, 0, 360);
        g.setColor(numberColor);
        g.drawString("9", xcenter-45, ycenter+3);
        g.drawString("3", xcenter+40, ycenter+3);
        g.drawString("12", xcenter-5, ycenter-37);
        g.drawString("6", xcenter-3, ycenter+45);


        // Get the date to print at the bottom
        formatter.applyPattern("EEE MMM dd HH:mm:ss yyyy");
        today = formatter.format(currentDate);

        // Erase if necessary
        g.setColor(getBackground());
        if (xs != lastxs || ys != lastys) {
            g.drawLine(xcenter, ycenter, lastxs, lastys);
            g.drawString(lastdate, 5, 125);
        }
        if (xm != lastxm || ym != lastym) {
            g.drawLine(xcenter, ycenter-1, lastxm, lastym);
            g.drawLine(xcenter-1, ycenter, lastxm, lastym);
        }
        if (xh != lastxh || yh != lastyh) {
            g.drawLine(xcenter, ycenter-1, lastxh, lastyh);
            g.drawLine(xcenter-1, ycenter, lastxh, lastyh);
        }

        // Draw date and hands
        g.setColor(numberColor);
        g.drawString(today, 5, 125);
        g.drawLine(xcenter, ycenter, xs, ys);
        g.setColor(handColor);
        g.drawLine(xcenter, ycenter-1, xm, ym);
        g.drawLine(xcenter-1, ycenter, xm, ym);
        g.drawLine(xcenter, ycenter-1, xh, yh);
        g.drawLine(xcenter-1, ycenter, xh, yh);
        lastxs = xs; lastys = ys;
        lastxm = xm; lastym = ym;
        lastxh = xh; lastyh = yh;
        lastdate = today;
        currentDate = null;
    }

    public void start() {
        timer = new Thread(this);
        timer.start();
    }

    public void stop() {
        timer = null;
    }

    public void run() {
        Thread me = Thread.currentThread();
        while (timer == me) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
            }
            repaint();
        }
    }

    public void update(Graphics g) {
        paint(g);
    }

    public String getAppletInfo() {
        return "Title: A Clock \n"
            + "Author: Rachel Gollub, 1995 \n"
            + "An analog clock.";
    }

    public String[][] getParameterInfo() {
        String[][] info = {
            {"bgcolor", "hexadecimal RGB number",
             "The background color. Default is the color of your browser."},
            {"fgcolor1", "hexadecimal RGB number",
             "The color of the hands and dial. Default is blue."},
            {"fgcolor2", "hexadecimal RGB number",
             "The color of the second hand and numbers. Default is dark gray."}
        };
        return info;
    }
}
/**
<applet code="Clock.class" width=170 height=150>
<param name=bgcolor value="000000">
<param name=fgcolor1 value="ff0000">
<param name=fgcolor2 value="ff00ff">
</applet>

would give you a black background, a red dial and hands, and purple numbers.

For those who don't convert to hexadecimal easily, here are some common values:

black = 000000
blue = 0000ff
cyan = 00ffff
darkGray = 404040
gray = 808080
green = 00ff00
lightGray = c0c0c0
magenta = ff00ff
orange = ffc800
pink = ffafaf
red = ff0000
white = ffffff
yellow = ffff00

**/