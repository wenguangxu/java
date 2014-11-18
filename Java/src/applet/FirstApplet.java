package applet;

import java.awt.Color;
import java.awt.Graphics;
/**
 * 继承系统提供的Applet 类，这个类是小应用程序的主类
 * @author wenguang.xu
 *
 */
public class FirstApplet extends java.applet.Applet{

	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawString("欢迎学习java语言", 30, 20);
		g.setColor(Color.red);
		g.drawString("只要认真学习", 30, 50);
	}

}
