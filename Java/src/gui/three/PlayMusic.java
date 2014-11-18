package gui.three;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayMusic extends Applet implements ActionListener {
	AudioClip clip; // 声明一个音频对象
	Button buttonPlay, buttonLoop, buttonStop;

	public void init() {
		clip = getAudioClip(this.getClass().getResource("music/1.wav"));
		// 根据程序所在地址处声音文件2.wav 创建音频对象，
		// Applet 类的getCodeBase()方法可以获得小程序所在的html 页面的URL 地址。
		buttonPlay = new Button("开始播放");
		buttonLoop = new Button("循环播放");
		buttonStop = new Button("停止播放");
		buttonPlay.addActionListener(this);
		buttonStop.addActionListener(this);
		buttonLoop.addActionListener(this);
		add(buttonPlay);
		add(buttonLoop);
		add(buttonStop);
	}

	public void stop() {
		clip.stop(); // 当离开此页面时停止播放
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
}
