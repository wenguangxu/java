package gui.two;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * JCheckBox选择框(复选框)/单选框
 */
public class JcheckBox {

	public static void main(String[] args) {
		//jCheckBoxTest();
		/*Panel1 p1 = new Panel1();
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		jf.add(p1);
		jf.setVisible(true);*/
		singleCheckBoxTest();
		
	}
	
	//选择框(复选框)
	public static void jCheckBoxTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		//JCheckBox jcb = new JCheckBox();//空标题
		//JCheckBox jcb = new JCheckBox("篮球");//给定标题
		JCheckBox jcb = new JCheckBox("篮球",true);//给定标题,给定选中状态
		//jcb.setSelected(false);//设置选中状态
		//System.out.println(jcb.isSelected());//获取选中状态
		jcb.setText("a");//设置文本
		System.out.println(jcb.getText());//获取选择框文本
		
		jp.add(jcb);
		jf.add(jp);
		jf.setVisible(true);
	}

	static class Panel1 extends JPanel{
		JCheckBox jcb1,jcb2,jcb3;
		Panel1(){
			jcb1 = new JCheckBox("足球");
			jcb2 = new JCheckBox("篮球");
			jcb3 = new JCheckBox("排球");
			add(jcb1);
			add(jcb2);
			add(jcb3);
		}
	}

	//单选框
	public static void singleCheckBoxTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JCheckBox jcb1 = new JCheckBox("篮球");//给定标题,给定选中状态
		JCheckBox jcb2 = new JCheckBox("足球");//给定标题,给定选中状态
		JCheckBox jcb3 = new JCheckBox("排球");//给定标题,给定选中状态
		
		//将JCheckBox放入ButtonGroup中就成了单选框
		ButtonGroup bg = new ButtonGroup();
		bg.add(jcb1);
		bg.add(jcb2);
		bg.add(jcb3);
		
		JPanel jp = new JPanel();
		
		jp.add(jcb1);
		jp.add(jcb2);
		jp.add(jcb3);
		jf.add(jp);
		jf.setVisible(true);
	}
}
