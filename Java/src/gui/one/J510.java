package gui.one;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Panel1 extends JPanel {
	JTextField text1, text2, text3;

	Panel1() {// 构造方法。当创建Panel 对象时，Panel 被初始化为有三个标签
	// 三个文本框，布局为GridLayout(1,6)
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		text3 = new JTextField(10);
		setLayout(new GridLayout(1, 6));
		add(new JLabel("起始数", JLabel.RIGHT));
		add(text1);
		add(new JLabel("终止数", JLabel.RIGHT));
		add(text2);
		add(new JLabel("因子", JLabel.RIGHT));
		add(text3);
	}
}

class Panel2 extends JPanel {// 扩展Panel 类
	JTextArea text;
	JButton Button;

	Panel2() {// 构造方法。当创建Panel 对象时，Panel 被初始化为有一个标签
	// 一个文本框，布局为GridLayout(1,4)
		text = new JTextArea(4, 10);
		text.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(text);
		Button = new JButton("开始计算");
		setLayout(new GridLayout(1, 4));
		add(new JLabel("计算结果：", JLabel.RIGHT));
		add(jsp);
		add(new Label());
		add(Button);
	}
}

public class J510 extends Applet implements ActionListener {
	Panel1 panel1;
	Panel2 panel2;

	public void init() {
		setLayout(new GridLayout(3, 1));
		setSize(400, 200);
		panel1 = new Panel1();
		panel2 = new Panel2();
		add(new JLabel("计算从起始数到终止数是因子倍数的数", JLabel.CENTER));
		add(panel1);
		add(panel2);
		(panel2.Button).addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == (panel2.Button)) {
			panel2.text.setText("");//清空文本区
			long n1, n2, f, count = 0;
			n1 = Long.parseLong(panel1.text1.getText());
			n2 = Long.parseLong(panel1.text2.getText());
			f = Long.parseLong(panel1.text3.getText());
			for (long i = n1; i <= n2; i++) {
				if (i % f == 0)
					panel2.text.append(String.valueOf(i) + "");
			}
		}
	}
	
	public static void main(String[]args){
		J510 j = new J510();
		j.init();
	}
}
