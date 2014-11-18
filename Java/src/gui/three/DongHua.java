package gui.three;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class DongHua extends Applet implements Runnable {
	final int number = 5;
	int count = 0;
	Thread mythread;
	Image[] pic = new Image[number];

	public void init() {
		setSize(300, 200);
		for (int i = 0; i < number; i++) {
			// 载入动画图片
			pic[i] = getImage(this.getClass().getResource("image/"+(i+1)+".jpg"));
		}
	}

	public void start() {
		mythread = new Thread(this); // 创建一个线程
		mythread.start(); // 启动线程执行
	}

	public void stop() {
		mythread = null;
	}

	public void run() {
		// 线程的执行代码
		while (true) {
			repaint();
			count = (count + 1) % number; // 改变显示的图片号
			try {
				mythread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g){
		if(pic[count] != null)
		g.drawImage(pic[count], 10, 10, pic[count].getWidth(this), pic[count].getHeight(this), this);
	}
}
