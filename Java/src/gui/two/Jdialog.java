package gui.two;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * JDialog对话框
 */
public class Jdialog implements ActionListener {
	JFrame jf;

	public static void main(String[] args) {
		Jdialog jd = new Jdialog();
		jd.jDialogTest();
	}

	public void jDialogTest() {
		jf = new JFrame();
		jf.setBounds(300, 301, 400, 300);
		jf.setVisible(true);

		JPanel jp = new JPanel();
		JButton jb = new JButton("click");
		jp.add(jb);
		jb.addActionListener(this);
		jf.add(jp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// JDialog jd = new JDialog();//构造一个初始化不可见的非强制型对话框
		// JDialog jd = new JDialog(jf,
		// "hello");//构造一个初始化不可见的非强制型对话框，设置对话框所依赖的窗口、标题。
		JDialog jd = new JDialog(jf, "hello", true);// 依赖的窗口、标题、是否模式
		jd.setTitle("aaa");
		System.out.println(jd.getTitle());
		jd.setModal(false);
		jd.setBounds(300, 200, 200, 100);
		jd.setVisible(true);
	}

}
