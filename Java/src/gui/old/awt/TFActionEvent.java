package gui.old.awt;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFActionEvent {
	public static void main(String[] args) {
		new TFFrame();
	}
}

class TFFrame extends Frame {
	TFFrame(){
		TextField tf = new TextField();
		//tf.setEchoChar('*');//设置回显字符(密码框)
		add(tf);
		tf.addActionListener(new TFActionListener());
		pack();
		setVisible(true);
	}
}

class TFActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
	
}
