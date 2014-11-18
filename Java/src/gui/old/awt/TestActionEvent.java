package gui.old.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent {
	public static void main(String[] args) {
		Frame f = new Frame();
		Button b = new Button("hi");
		Monitor m = new Monitor();
		b.addActionListener(m);
		f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("pressed");
	}
	
}
