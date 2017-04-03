import java.applet.*;
import java.awt.*;
import javax.
public class Apple extends Applet{

	static final String MESSAGE = " Its an Apple ";

	private Font font;

	public void init(){ font = new Font("Courier", Font.BOLD, 48); };

	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillOval(10,10,430,100);

		g.setColor(Color.black);
		g.drawOval(10,10,430,100);
		g.drawOval(9,9,432,102);
		g.drawOval(8,8,434,104);
		g.drawOval(7,7,436,106);

		g.setColor(Color.black);
		g.setFont(font);

		g.drawString(MESSAGE,40,75);

	}

}