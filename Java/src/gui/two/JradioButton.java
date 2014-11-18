package gui.two;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * 单选按钮
 */
public class JradioButton {

	public static void main(String[] args) {
		jRadioButtonTest();
	}
	
	//JRadioButton test
	public static void jRadioButtonTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		//JRadioButton jrb = new JRadioButton();
		JRadioButton jrb1 = new JRadioButton("男");//给定标题,给定选中状态
		JRadioButton jrb2 = new JRadioButton("女",true);//给定标题,给定选中状态
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		jp.add(jrb1);
		jp.add(jrb2);
		jf.add(jp);
		jf.setVisible(true);
	}

}
