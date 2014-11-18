package gui.two;

import java.applet.Applet;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * 组合框(JComboBox)
 */
public class JcomboBox {

	public static void main(String[] args) {
		//jComboBoxTest();
		myFrame f = new myFrame();
		f.init();
	}
	
	public static void jComboBoxTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		String[] s = {"","a","b"};
		//JComboBox jcb = new JComboBox();
		JComboBox jcb = new JComboBox(s);//数组对象初始化
		jcb.addItem("c");//加入选项
		//System.out.println(jcb.getItemCount());//获取选项个数
		//jcb.removeItem("b");//删除指定选项
		//jcb.removeItemAt(2);//删除指定索引的选项
		jcb.insertItemAt("d", 4);//在指定索引处插入选项
		//System.out.println(jcb.getSelectedIndex());//获取所选项的索引
		//System.out.println(jcb.getSelectedItem());//获取所选项的值
		jcb.setEditable(true);//设为可编辑，默认不可编辑
		
		jp.add(jcb);
		jf.add(jp);
		jf.setVisible(true);
	}

	static class panel extends JPanel implements ItemListener{
		JTextField jtf;
		JComboBox jcb;
		public panel(){
			String[] s = {"足球","篮球","排球"};
			jcb = new JComboBox(s);
			jcb.setEditable(true);
			jtf = new JTextField(10);
			add(jcb);
			add(jtf);
			jcb.addItemListener(this);
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==jcb){
				jtf.setText(jcb.getSelectedItem().toString());
			}
		}
	}
	
	static class myFrame extends JFrame{
		public void init(){
			panel p = new panel();
			add(p);
			setVisible(true);
		}
	}
}
