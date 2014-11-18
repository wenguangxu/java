package gui.two;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * 简单对话框
 */
public class JoptionPane implements ActionListener{
	JFrame jf;
	public static void main(String[] args) {
		JoptionPane jop = new JoptionPane();
		jop.jOptionPane();
	}

	public void jOptionPane(){
		jf = new JFrame();
		jf.setBounds(300, 301, 400, 300);
		jf.setVisible(true);
		
		JButton jb = new JButton("click");
		jb.addActionListener(this);
		JPanel jp = new JPanel();
		jp.add(jb);
		jf.add(jp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//确认对话框
		//int j = JOptionPane.showConfirmDialog(jf, "确认退出？","退出确认",JOptionPane.YES_NO_OPTION);//父窗口、提示文字、标题、按钮
		//列表选择对话框
		//String j = (String)JOptionPane.showInputDialog(jf,"请选择一项运动项目","运动项目选择对话框",JOptionPane.QUESTION_MESSAGE,null,new Object[]{"踢足球","打篮球","跑步","跳绳"},"跑步");
		//int j = JOptionPane.showOptionDialog(jf, "a", "b", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE,null,new String[]{"a","b","c"},"b");
		JOptionPane.showMessageDialog(jf, "a","b",JOptionPane.PLAIN_MESSAGE);
		//System.out.println(j);
	}
}
