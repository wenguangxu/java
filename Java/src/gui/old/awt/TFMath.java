package gui.old.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 持有对方引用
 * @author Administrator
 *
 */
public class TFMath {
	public static void main(String[] args) {
		new TFFrame2().launchFrame();;
	}
}

class TFFrame2 extends Frame {
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEquals = new Button("=");
		btnEquals.addActionListener(new MyMonitor(this));
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus);
		add(num2);
		add(btnEquals);
		add(num3);
		pack();
		setVisible(true);
	}
}

class MyMonitor implements ActionListener {

	TFFrame2 f = null;
	
	public MyMonitor(TFFrame2 f) {
		this.f = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int n1 = Integer.parseInt(f.num1.getText());
		int n2 = Integer.parseInt(f.num2.getText());
		f.num3.setText(String.valueOf(n1+n2));
	}
	
}
