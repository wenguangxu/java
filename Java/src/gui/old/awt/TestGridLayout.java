package gui.old.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class TestGridLayout {
public static void main(String[] args) {
	Frame f = new Frame("hello");
	f.setLayout(new GridLayout(3,2));
	
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.pack();//使窗口适应里面组件的大小
	f.setVisible(true);
}
}
