package gui.three;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayMusic2 extends Applet implements Runnable, ActionListener {
	AudioClip clip; // 声明一个音频对象
	TextField text;
	Thread thread;
	Button buttonPlay, buttonLoop, buttonStop;

	public void init() {
		thread = new Thread(this); // 创建新线程
		thread.setPriority(Thread.MIN_PRIORITY);
		buttonPlay = new Button("开始播放");
		buttonLoop = new Button("循环播放");
		buttonStop = new Button("停止播放");
		text = new TextField(12);
		buttonPlay.addActionListener(this);
		buttonStop.addActionListener(this);
		buttonLoop.addActionListener(this);
		add(buttonPlay);
		add(buttonLoop);
		add(buttonStop);
		add(text);
	}

	public void start() {
		thread.start();
	}

	public void stop() {
		clip.stop();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonPlay) {
			clip.play();
		} else if (e.getSource() == buttonLoop) {
			clip.loop();
		} else if (e.getSource() == buttonStop) {
			clip.stop();
		}
	}

	public void run() {
		// 在线程thread 中创建音频对象
		clip = getAudioClip(this.getClass().getResource("music/1.wav"));
		text.setText("请稍等");
		if (clip != null) {
			buttonPlay.setBackground(Color.red);
			buttonLoop.setBackground(Color.green);
			text.setText("您可以播放了");
		} // 获得音频对象后通知可以播放
	}
}