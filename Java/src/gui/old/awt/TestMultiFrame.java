package gui.old.awt;

import java.awt.Color;
import java.awt.Frame;

public class TestMultiFrame {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame(100, 100, 200, 200, Color.blue);
		MyFrame f2 = new MyFrame(300, 100, 200, 200, Color.yellow);
		MyFrame f3 = new MyFrame(100, 300, 200, 200, Color.green);
		MyFrame f4 = new MyFrame(300, 300, 200, 200, Color.magenta);
	}
}

class MyFrame extends Frame {
	static int id = 0;
	MyFrame(int x,int y,int w,int h,Color color){
		super("MyFrame" + (++id));
		setBackground(color);
		setLayout(null);
		setBounds(x,y,w,h);
		setVisible(true);
	}
}
