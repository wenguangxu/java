package gui.one;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 * JPanel/JScrollPane(带滚动条的面板)
 */
public class Jpanel {

	public static void main(String[] args) {
		//jPanelTest();
		/*J504 j = new J504();
		j.init();*/
		jScrollPaneTest();
	}
	
	public static void jPanelTest(){
		JFrame jf = new JFrame("JPanelTest");
		jf.setBounds(500, 500, 300, 200);
		jf.setVisible(true);
		
		JPanel jp = new JPanel();//默认布局为"FlowLayout"
		JPanel jp2 = new JPanel();
		
		JButton jb = new JButton("提交");
		
		jp.add(jb);
		//jp.add("jpstr",jb);//当面板采用GardLayout布局时，字符串是引用添加组件的代号
		jf.add(jp);
	}

	static class MyPanel extends JPanel{
		JButton button1,button2;
		JLabel label;
		public MyPanel(String s1,String s2,String s3){
			//Panel对象被初始化为有两个按钮和一个文本框
			button1 = new JButton(s1);
			button2 = new JButton(s2);
			label = new JLabel(s3);
			add(button1);
			add(button2);
			add(label);
		}
	}
	
	static class J504 extends JApplet{
		MyPanel panel1,panel2;
		JButton button;
		
		public void init(){
			panel1 = new MyPanel("确定", "取消", "标签，我们在面板1中");
			panel2 = new MyPanel("确定", "取消", "标签，我们在面板2中");
			button = new JButton("我是不在面板中的按钮");
			add(panel1);
			add(panel2);
			add(button);
			setSize(300, 200);
			
			JFrame jf = new JFrame();
			jf.add(panel1);
			//jf.add(panel2);
			jf.add(button);
			jf.setSize(300, 200);
			jf.setVisible(true);
		}
	}

	public static void jScrollPaneTest(){
		JButton jb = new JButton("submit");
		JButton jb2 = new JButton("submit");
		jb2.setBounds(800, 800, 100, 100);
		JTextArea jt = new JTextArea("hah", 5, 20);
		
		JPanel jp = new JPanel();
		jp.add(jb);
		jp.add(jb2);
		jp.add(jt);
		
		JScrollPane jsp = new JScrollPane(jp);
		//jsp.setViewportView(jp);//放组件对象
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//设置水平滚动条(根据需要显示)
		//jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);//设置水平滚动条(总是显示)
		//jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);//设置水平滚动条(从不显示)
		
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);//设置垂直滚动条(根据需要显示)
		//jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//设置垂直滚动条(总是显示)
		//jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);//设置垂直滚动条(从不显示)
		
		JFrame jf = new JFrame();
		jf.add(jsp);
		jf.setSize(300,200);
		jf.setVisible(true);
	}
}
