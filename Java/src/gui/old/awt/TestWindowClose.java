package gui.old.awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 匿名类(局部类)
 * @author Administrator
 *
 */
public class TestWindowClose {
	public static void main(String[] args) {
		new MyFrame4("hello");
	}
}

class MyFrame4 extends Frame {
	MyFrame4(String s){
		super(s);
		setLayout(null);
		setBounds(300,300,400,300);
		this.setBackground(Color.red);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(0);
			}
		});
	}
}