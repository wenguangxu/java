package gui.two;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 键盘事件
 * @author wenguang.xu
 *
 */
public class Keyevent implements KeyListener{

	public static void main(String[] args) {
		Keyevent k = new Keyevent();
		k.keyEventTest();
	}
	
	public void keyEventTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		JTextField jtf = new JTextField(10);
		jtf.addKeyListener(this);
		jp.add(jtf);
		jf.add(jp);
		jf.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyPressed和keyReleased的组合
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//某键被按下
		System.out.println("keyPressed");
		System.out.println(e.getKeyCode());//获取按下的键码
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//某键被释放
		System.out.println("keyReased");
	}

}
