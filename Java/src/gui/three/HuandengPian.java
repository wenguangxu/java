package gui.three;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class HuandengPian extends Applet implements MouseListener{
	final int number = 5; //假定幻灯片有50 张
	int count = 0;
	Image[] card = new Image[number];
	public void init(){
		addMouseListener(this);
		for (int i = 0; i < number; i++){
			URL url = this.getClass().getResource("image/"+(i+1)+".jpg");
			card[i] = getImage(url);
		}
	}
	public void paint(Graphics g){
		if ((card[count]) != null)
		g.drawImage(card[count], 10, 10, card[count].getWidth(this),
		card[count].getHeight(this), this);
	}
	
	public void mousePressed(MouseEvent e){
		count = (count + 1) % number; //循环逐张显示
		repaint();
	}
	
	public void mouseRelease(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}
