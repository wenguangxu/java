package gui.three;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsTest1 extends Applet {

	int i = 1;

	public void init() {
		setBackground(Color.yellow);
	}

	public void paint(Graphics g) {
		i = i + 8;
		if (i > 160)
			i = 1;
		g.setColor(Color.red);
		g.fillRect(i, 10, 20, 20);
		g.drawString("我正学习update()方法", 100, 100);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		repaint();
	}

	public void update(Graphics g) {
		g.clearRect(i, 10, 200, 100);// 不清除"我正在学习update()方法"
		paint(g);
	}
}
