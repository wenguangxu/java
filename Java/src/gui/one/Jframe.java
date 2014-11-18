package gui.one;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * JFrame
 *
 */
public class Jframe {
	
	public static MyWindowDemo w1;
	public static MyWindowDemo w2;
	
	public static void main(String[]args){
		JFrame jf = new JFrame("first jframe");
		jf.setBounds(500, 200, 500, 300);//距左、距右、宽、高
		//jf.setSize(600,600);//宽、高
		jf.setBackground(Color.white);
		//jf.pack();//用紧凑方式显示窗口。如果不使用该方法，窗口初始出现时可能看不到窗口中的组件，当用户调整窗口的大小时，可能才能看到这些组件。
		jf.setTitle("aa");
		System.out.println(jf.getTitle());
		//jf.setResizable(false);//设置当前窗口是否可调整大小(默认可调整大小)。
		//jf.setVisible(true);//默认是不可见
		
		//向窗口中添加按钮
		JButton jb = new JButton("我是一个按钮");
		jb.setSize(10,5);
		jf.getContentPane().add(jb);
		
		 JButton b1 = new JButton("第一个");
		 String name1 = "第一个窗口";
		 w1 = new MyWindowDemo(name1, b1, Color.red, 350, 450);
		 w1.setVisible(true);
		 JButton b2 = new JButton("第二个");
		 b2.setBackground(Color.magenta);
		 String name2 = "第二个窗口";
		 w2 = new MyWindowDemo(name2, b2, Color.magenta, 300, 400);
		 w2.setVisible(true);
		
	}
	
	static class MyWindowDemo extends JFrame{
		public MyWindowDemo(String name,JButton button,Color c,int w,int h){
			super();
			setTitle(name);
			setSize(w, h);
			Container con = getContentPane();
			con.add(button);
			setBackground(c);
		}
	}
	
}
