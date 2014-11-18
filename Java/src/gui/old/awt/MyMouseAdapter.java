package gui.old.awt;


import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 重新绘制
 * @author Administrator
 *
 */
public class MyMouseAdapter {
	public static void main(String[] args) {
		new MyFrame3("hello");
	}
}

class MyFrame3 extends Frame {
	ArrayList points = null;
	public MyFrame3(String s) {
		super(s);
		points = new ArrayList();
		setLayout(null);
		setBounds(300,300,400,300);
		setBackground(Color.white);
		setVisible(true);
		addMouseListener(new Monitor3());
	}
	
	public void paint(Graphics g){
		Iterator i = points.iterator();
		while(i.hasNext()){
			Point p = (Point)i.next();
			g.setColor(Color.blue);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
	
	public void addPoint(Point p){
		points.add(p);
	}
}

class Monitor3 extends MouseAdapter {
	public void mousePressed(MouseEvent e){
		MyFrame3 f = (MyFrame3)e.getSource();
		f.addPoint(new Point(e.getX(), e.getY()));
		f.repaint();
	}
}
