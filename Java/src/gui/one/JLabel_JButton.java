package gui.one;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * JLabel/JButton
 */
public class JLabel_JButton implements ActionListener{

	public static void main(String[] args) {
		jLabelTest();
		//JLabel_JButton jlabel = new JLabel_JButton();
		//jlabel.jButtonTest();
	}
	
	public static void jLabelTest(){
		JFrame jf = new JFrame();
		jf.setBounds(10, 20, 300, 200);
		jf.setVisible(true);
		JLabel jl1 = new JLabel();
		JLabel jl2 = new JLabel("姓名：");
		JLabel jl3 = new JLabel("姓名：",JLabel.CENTER);//文字、对齐方式
		jl3.setText("aa");
		System.out.println(jl3.getText());
		jl3.setBackground(Color.RED);
		jl3.setForeground(Color.RED);//前景色(文字颜色)
		//System.out.println(jl3.getBackground());
		jf.getContentPane().add(jl3);
	}

	public void jButtonTest(){
		JFrame jf = new JFrame();
		jf.setBounds(10, 20, 300, 200);
		jf.setVisible(true);
		JButton jb = new JButton();
		JButton jb2 = new JButton("提交");
		jb2.setBounds(10, 10, 100, 70);
		jb2.setText("tijiao");
		System.out.println(jb2.getText());
		jb2.setMnemonic('k');//设置热键(alt+k)
		jb2.setToolTipText("提交数据");//鼠标悬浮文字
		jb2.setActionCommand("nn");//设置命令字符串(实现事件的方法里面可以调用)
		jb2.setRolloverEnabled(true);//设置是否可以滚动
		jb2.addActionListener(this);//添加监视器(当前类中实现的方法)
		JbuttonAction jba = new JbuttonAction();
		//jb2.addActionListener(jba);//添加另外类的单击事件
		//jb2.removeActionListener(l);//移除监视器
		jf.getContentPane().add(jb2);
	}

	/**
	 * 在当前类中实现单击事件
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		String text = e.getActionCommand();//获取源对象按钮命令字符串(按钮的命令字符串默认是text)
		System.out.println(text);
	}
	
	
	/**
	 * 另外一个类实现单击事件
	 * @author wenguang.xu
	 *
	 */
	class JbuttonAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton)e.getSource();
			jb.setForeground(Color.red);
		}
		
	}
}
