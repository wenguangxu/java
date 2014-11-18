package gui.old.awt;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		Frame f = new Frame("First");
		f.setLocation(300,300);
		f.setSize(500,500);
		f.setBackground(Color.red);
		f.setResizable(false);
		f.setVisible(true);
	}
}
