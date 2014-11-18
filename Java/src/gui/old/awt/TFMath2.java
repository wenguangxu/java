package gui.old.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 内部类
 * @author Administrator
 *
 */
public class TFMath2 {
	public static void main(String[] args) {
		new TFFrame3().launchFrame();;
	}
}

class TFFrame3 extends Frame {
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEquals = new Button("=");
		btnEquals.addActionListener(new MyMonitor2());
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus);
		add(num2);
		add(btnEquals);
		add(num3);
		pack();
		setVisible(true);
	}
	
	class MyMonitor2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(String.valueOf(n1+n2));
		}
	}
}

