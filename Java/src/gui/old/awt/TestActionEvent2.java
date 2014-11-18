package gui.old.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 一个事件监听两个事件源
 * @author Administrator
 *
 */
public class TestActionEvent2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		Button b1 = new Button("start");
		Button b2 = new Button("stop");
		Monitor2 m = new Monitor2();
		b1.addActionListener(m);
		b2.addActionListener(m);
		b2.setActionCommand("game over");
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());//获取actioncommond，如果没有设置，则默认为按钮上的文本
	}
	
}
