package gui.one;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 文本框(密码框)/文本区
 */
public class JTextField_JTextArea implements FocusListener {

	public static void main(String[] args) {
		// JTextField_JTextArea j = new JTextField_JTextArea();
		// j.jTextFieldTest();
		// jTextAreaTest();
		// jPasswordFieldTest();
	}

	public void jTextFieldTest() {
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(400, 400, 500, 400);

		// JTextField jtf = new JTextField();//文本框字符长度为一
		// JTextField jtf = new JTextField(10);//文本框初始值为空字符串，文本框的字符长度设为columns.
		// JTextField jtf = new JTextField("姓名");//文本框初始值为text 的字符串。
		JTextField jtf = new JTextField("请输入用户名", 10);// 文本框初始值为text，文本框的字符长度为columns。
		// jtf.setFont();//设置字体
		// jtf.setText("hah");
		System.out.println(jtf.getText());
		// jtf.setEditable(false);//指定文本框的可编辑性，默认为true，可编辑。
		// jtf.setBackground(Color.BLUE);
		jtf.setHorizontalAlignment(JTextField.LEFT);// 设置文本对齐方式。对齐方式有：JTextField.LEFT,
													// JTextField.CENTER,JTextField.RIGHT。
		// jtf.requestFocus();//设置焦点
		System.out.println(jtf.getColumns());// 文本框列数(长度)
		System.out.println(jtf.getMinimumSize());// 返回文本框所需的最小尺寸。
		System.out.println(jtf.getPreferredSize());// 返回文本框希望具有的尺寸。
		jtf.addFocusListener(this);
		// jtf.removeFocusListener(this);

		JPanel jp = new JPanel();
		jp.add(jtf);
		jf.add(jp);
		jtf.setVisible(true);
		jf.setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		JTextField jtf = (JTextField) e.getSource();
		jtf.setText("");
	}

	@Override
	public void focusLost(FocusEvent e) {
		JTextField jtf = (JTextField) e.getSource();
		jtf.setText("请输入用户名");
	}

	public static void jPasswordFieldTest() {
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(400, 400, 500, 400);

		JPanel jp = new JPanel();
		jf.add(jp);

		JPasswordField jpf = new JPasswordField(10);
		// jpf.setEchoChar('*');
		System.out.println(jpf.getEchoChar());// 返回密码的回显字符。
		jp.add(jpf);
		jf.setVisible(true);
	}

	public static void jTextAreaTest() {
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(400, 400, 500, 400);

		JPanel jp = new JPanel();
		// JTextArea jta = new JTextArea("aaaaa");
		// JTextArea jta = new JTextArea(5,10);//行，列
		JTextArea jta = new JTextArea("aaaaa", 5, 10);// 默认值，行，列
		jta.setText("bbbb");
		System.out.println(jta.getText());
		// jta.insert("aa", 2);//在指定的位置插入文本
		// jta.replaceRange("a", 1, 3);//替换指定位置的文本
		// jta.append("aaa");//追加文本
		// jta.setCaretPosition(1);//设置活动光标位置
		// System.out.println(jta.getCaretPosition());//获取活动光标位置
		jta.setLineWrap(true);// 设置文字自动换行
		JScrollPane jsp = new JScrollPane(jta);// 超过最大字数时，显示滚动条

		jp.add(jsp);
		jf.add(jp);
		jta.setVisible(true);
		jp.setVisible(true);
		jf.setVisible(true);
	}
}

