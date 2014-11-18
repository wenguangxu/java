package gui.three;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 * 设置颜色并涂方块
 * @author Administrator
 *
 */
public class Font_Color extends Applet{
	public void paint(Graphics g) {
		setSize(380, 200);
		for (int i = 0; i <= 10; i++) {
			Color myredcolor = new Color(i * 25 + 5, 0, 0);
			g.setColor(myredcolor);
			g.fillRect(i * 32 + 5, 2, 28, 28);
		}
		for (int i = 0; i <= 10; i++) {
			Color mygreencolor = new Color(0, i * 25 + 5, 0);
			g.setColor(mygreencolor);
			g.fillRect(i * 32 + 5, 32, 28, 28);
		}
		for (int i = 0; i <= 10; i++) {
			Color mybluecolor = new Color(0, 0, i * 25 + 5);
			g.setColor(mybluecolor);
			g.fillRect(i * 32 + 5, 62, 28, 28);
		}
	}
}
