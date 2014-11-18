package gui.two;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 * 滚动条(JScrollBar)
 * @author wenguang.xu
 *
 */
public class JscrollBar {

	public static void main(String[] args) {
		jScrollBarTest();
	}
	
	/**
	 * 
	 */
	public static void jScrollBarTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		//JScrollBar jsb = new JScrollBar();
		//JScrollBar jsb = new JScrollBar(JScrollBar.VERTICAL);//指定滚动条的方向(垂直)
		//JScrollBar jsb = new JScrollBar(JScrollBar.HORIZONTAL);//指定滚动条的方向(水平)
		JScrollBar jsb = new JScrollBar(JScrollBar.HORIZONTAL,1000,1000,0,5000);
		jsb.setUnitIncrement(50);//设置滚动的增量
		System.out.println(jsb.getUnitIncrement());//获取滚动的增量
		jsb.setBlockIncrement(50);//设置滑块的增量
		System.out.println(jsb.getBlockIncrement());//获取滑块的增量
		jsb.setMaximum(5000);//设置最大值
		System.out.println(jsb.getMaximum());//获取最大值
		jsb.setMinimum(1);//设置最小值
		System.out.println(jsb.getMinimum());//获取最小值
		jsb.setValue(30);//设置新值
		System.out.println(jsb.getValue());//获取新值
		
		jp.add(jsb);
		jf.add(jp);
		jf.setVisible(true);
	}

}
