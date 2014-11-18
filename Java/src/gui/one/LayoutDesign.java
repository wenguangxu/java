package gui.one;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * 布局设计
 * FlowLayout依次放置组件
 * BorderLayout将组件放置在边界上
 * CardLayout将组件像扑克牌一样叠放，每次显示一个组件
 * GridLayout按行、列划分成各自、组件依次放入
 * GridBagLayout将显示区域划分成许多矩形小单元，每个组件可占用一个或多个小单元
 * null布局
 */
public class LayoutDesign {

	public static void main(String[] args) {
		// flowLayoutTest();
		// borderLayoutTest();
		// gridLayoutTest();
		/*
		 * J506 j = new J506(); j.init();
		 */
		//cardLayoutTest();
		/*J507 j = new J507();
		j.init();*/
		nullLayoutTest();
	}

	// 流式布局
	public static void flowLayoutTest() {
		JFrame jf = new JFrame();
		jf.setBounds(600, 600, 300, 200);
		jf.setVisible(true);

		JButton jb1 = new JButton("button1");
		JButton jb2 = new JButton("button2");
		JButton jb3 = new JButton("button3");
		JButton jb4 = new JButton("button4");
		JPanel jp = new JPanel();
		// jp.setLayout(new FlowLayout());//为容器设置流式布局
		// jp.setLayout(new
		// FlowLayout(FlowLayout.CENTER));//为容器设置流式布局,并设置每行组件的对齐方式
		jp.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));// 为容器设置流式布局,并设置每行组件的对齐方式、组件水平间距(默认5px)、组件垂直间距(默认5px)
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);

		jf.add(jp);
	}

	// 表格布局
	public static void borderLayoutTest() {
		JFrame jf = new JFrame();
		jf.setBounds(100, 600, 300, 200);
		jf.setVisible(true);

		JButton jb1 = new JButton("button1");
		JButton jb2 = new JButton("button2");
		JButton jb3 = new JButton("button3");
		JButton jb4 = new JButton("button4");
		JButton jb5 = new JButton("button5");
		JPanel jp = new JPanel();
		// jp.setLayout(new BorderLayout());//为容器设置表格布局，默认没有间隙
		jp.setLayout(new BorderLayout(2, 2));// 为容器设置表格布局,组件水平间距、垂直间距
		// jp.setLayout(new
		// FlowLayout(FlowLayout.CENTER));//为容器设置流式布局,并设置每行组件的对齐方式
		// jp.setLayout(new
		// FlowLayout(FlowLayout.LEFT,20,20));//为容器设置流式布局,并设置每行组件的对齐方式、组件水平间距(默认5px)、组件垂直间距(默认5px)
		jp.add(jb1, BorderLayout.EAST);// 等同 jp.add(jb1,"East");
		jp.add(jb2, BorderLayout.WEST);// 等同 jp.add(jb2,"West");
		jp.add(jb3, BorderLayout.SOUTH);// 等同 jp.add(jb3,"South");
		jp.add(jb4, BorderLayout.NORTH);// 等同 jp.add(jb4,"North");
		jp.add(jb5, BorderLayout.CENTER);// 等同 jp.add(jb5,"Center");

		jf.add(jp);
	}

	// 网格布局(会自动增减列)
	public static void gridLayoutTest() {
		JFrame jf = new JFrame();
		jf.setBounds(100, 600, 400, 200);
		jf.setVisible(true);

		JButton jb1 = new JButton("button1");
		JButton jb2 = new JButton("button2");
		JButton jb3 = new JButton("button3");
		JButton jb4 = new JButton("button4");
		JPanel jp = new JPanel();
		// jp.setLayout(new GridLayout());//为容器设置网格布局，生成单列的网格布局，无间隙
		// jp.setLayout(new GridLayout(3,4));//为容器设置网格布局,并设置行、列(会自动增减列)
		jp.setLayout(new GridLayout(3, 4, 2, 2));// 为容器设置网格布局,并设置行、列、组件水平间距(默认5px)、组件垂直间距(默认5px)
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);

		jf.add(jp);
	}

	static class MyWindow extends JFrame {
		public MyWindow(int w, int h) {
			setTitle("滚动面板实例");
			Container con = getContentPane();
			con.setPreferredSize(new Dimension(w, h));
			con.setLayout(new BorderLayout());
			JPanel p = new JPanel();
			p.setLayout(new GridLayout(6, 6));
			for (int i = 0; i < 6; i++) {
				p.add(new JLabel());
				for (int j = 1; j <= 2; j++) {
					p.add(new JButton("按钮" + (2 * i + j)));
					p.add(new JLabel("标签" + (2 * i + j)));
				}
				p.add(new JLabel());
			}
			p.setBackground(Color.blue);
			p.setPreferredSize(new Dimension(w + 60, h + 60));
			ScrollPane ScrollPane = new ScrollPane(p);
			ScrollPane.setPreferredSize(new Dimension(w - 60, h - 60));
			add(ScrollPane, BorderLayout.CENTER);// 小程序添加滚动面板
			setVisible(true);
			pack();
		}
	}

	static class ScrollPane extends JScrollPane {
		public ScrollPane(Component p) {
			super(p);
			setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		}
	}

	public static class J506 extends Applet {
		MyWindow myWindow;

		public void init() {
			myWindow = new MyWindow(400, 350);
		}
	}

	// 卡片布局
	public static void cardLayoutTest() {
		JFrame jf = new JFrame();
		jf.setBounds(100, 600, 400, 200);
		jf.setVisible(true);

		JButton jb = new JButton("submit");
		JButton jb2 = new JButton("jb2");

		CardLayout cardLayout = new CardLayout();

		JPanel panel = new JPanel();
		panel.setLayout(cardLayout);
		panel.add("jb", jb);
		panel.add("jb2", jb2);

		jf.add(panel);

		// cardLayout.show(panel,"jb2");//指定容器panel的组件代号"jb2"，显示这个组件
		// cardLayout.first(panel);//按组件加入的顺序显示
		// cardLayout.last(panel);//按组件加入的顺序显示
		// cardLayout.next(panel);//按组件加入的顺序显示
		cardLayout.previous(panel);// 按组件加入的顺序显示
	}

	static class MyPanel extends JPanel {
		int x;
		JLabel label1;

		MyPanel(int a) {
			x = a;
			getSize();
			label1 = new JLabel("我是第" + x + "个标签");
			add(label1);
		}

		public Dimension getPreferredSize() {
			return new Dimension(200, 50);
		}
	}

	public static class J507 extends Applet implements ActionListener {
		CardLayout mycard;
		MyPanel myPanel[];
		JPanel p;

		private void addButton(JPanel pan, String butName,
				ActionListener listener) {
			JButton aButton = new JButton(butName);
			aButton.addActionListener(listener);
			pan.add(aButton);
		}

		public void init(){
		setLayout(new BorderLayout());//小程序的布局是边界布局
		mycard=new CardLayout();
		this.setSize(400,150);
		p=new JPanel();
		p.setLayout(mycard);//p 的布局设置为卡片式布局
		myPanel=new MyPanel[10];
		for(int i=0;i<10;i++){
			myPanel[i]=new MyPanel(i+1);
			p.add("A"+i,myPanel[i]);
		}
		JPanel p2=new JPanel();
		addButton(p2,"第一个",this);
		addButton(p2,"最后一个",this);
		addButton(p2,"前一个",this);
		addButton(p2,"后一个",this);
		add(p,"Center"); add(p2,"South");
		JFrame jf = new JFrame();
		jf.setBounds(100, 600, 400, 200);
		jf.add(this);
		jf.setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("第一个"))
				mycard.first(p);
			else if (e.getActionCommand().equals("最后一个"))
				mycard.last(p);
			else if (e.getActionCommand().equals("前一个"))
				mycard.previous(p);
			else if (e.getActionCommand().equals("后一个"))
				mycard.next(p);
		}
	}
	
	//null布局
	public static void nullLayoutTest(){
		JFrame jf = new JFrame("hah");
		jf.setBounds(300, 300, 500, 300);
		jf.setVisible(true);
		
		JLabel jl = new JLabel("用户名：");
		jl.setBounds(50, 80, 100, 50);
		
		JButton jb = new JButton("提交");
		jb.setBounds(120, 80, 100, 50);
		System.out.println(jb.getSize().width);
		System.out.println(jb.getSize().height);
		
		JPanel jp = new JPanel(null);//设置为null布局
		jp.add(jl);
		jp.add(jb);
		jf.add(jp);
		
		
	}
}
