package gui.old.awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class TestPanel {
	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel(null);
		f.setLayout(null);
		f.setBounds(300,300,500,500);
		f.setBackground(new Color(0,0,112));
		p.setBounds(50,50,400,400);
		p.setBackground(Color.yellow);
		f.add(p);
		f.setVisible(true);
	}
}
