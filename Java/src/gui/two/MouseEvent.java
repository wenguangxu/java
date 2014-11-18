package gui.two;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 鼠标事件(MouseListener/MouseMotionListener)
 * @author wenguang.xu
 *
 */
public class MouseEvent implements MouseListener,MouseMotionListener{

	public static void main(String[] args) {
		MouseEvent me = new MouseEvent();
		me.mouseListenerTest();
	}

	public void mouseListenerTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		JTextField jtf = new JTextField(10);
		//jtf.addMouseListener(this);
		jtf.addMouseMotionListener(this);
		jp.add(jtf);
		jf.add(jp);
		jf.setVisible(true);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		//System.out.println(e.getX());//获取鼠标X坐标
		//System.out.println(e.getY());//获取鼠标Y坐标
		System.out.println(e.getClickCount());//获取鼠标点击次数
		System.out.println("mouseClicked鼠标单击");		
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("mousePressed鼠标按下");
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		System.out.println("mouseReleased鼠标松开");		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("mouseEntered鼠标进入");				
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("mouseExited鼠标移出");		
		
	}

	
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		System.out.println("mouseDragged鼠标拖动");		
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		System.out.println("mouseMoved鼠标移动");		
		
	}
}
