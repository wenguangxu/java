package gui.three;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageBuffer extends Applet {
	Image myPicture;

	/*
	 * init()方法中，先定义一个Image 对象，并赋予createImage()方法的返回值，接着创建Graphics 对象并赋予其图
	 * 形环境。最后，让Graphics 对象调用drawImage()方法显示图像。 由于这里的Graphics 对象offScreenGc
	 * 是非屏幕对象是，小程序窗口不会有图像显示
	 */
	public void init() {
		try {
			URL url = new URL("http://e.hiphotos.baidu.com/album/w%3D2048/sign=37173efbfe039245a1b5e60fb3aca5c2/5bafa40f4bfbfbed5fbdfe497af0f736afc31f24.jpg");
			myPicture = getImage(url);
			Image offScreenImage = createImage(getSize().width, getSize().height);
			Graphics offScreenGc = offScreenImage.getGraphics();
			new BufferedDemo(myPicture);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * drawImage()方法的第四个参数是实现ImageObserver
	 * 接口，在init()方法中，调用drawImage()方法的参数是this， 所以小程序要定义imageUpdate()方法
	 */
	public boolean imageUpdate(Image img, int infoFlg, int x, int y, int w, int h) {
		if (infoFlg == ALLBITS)// 表示图像已全部装入内存
		{
			repaint();
			return false;// 防止线程再次调用imageUpdate()方法
		} else
			return true;
	}
}

/*
 * 程序的执行过程是，当小程序调用drawImage()方法时，drawImage()方法将创建一个调用 imageUpdate()方法的线程，
 * 在imageUpdate()方法中，测定图像是否已在部分调入内存。创建的线程不断调用imageUpdate()方法，直到该方法返回 false
 * 为止。参数infoFlg 使小程序能知道图像装入内存的情况。当infoFlg 等于ALLBITS 时，表示图像已全部装入内
 * 存。当该方法发现图像已全部装入内存后，置imageLoaded 为真，并调用repaint()方法重画小程序窗口。方法返回false
 * 防止线程再次调用imageUpdate()方法。
 */
class BufferedDemo extends JFrame {
	public BufferedDemo(Image img) {
		this.getContentPane().add(new PicPanel(img));
		setTitle("双缓技术演示");
		setSize(300, 300);
		setVisible(true);
	}
}

class PicPanel extends JPanel implements MouseListener, MouseMotionListener {
	int x = 0, y = 0, dx = 0, cy = 0;
	BufferedImage bimg1, bimg2;
	boolean upState = true;

	public PicPanel(Image img) {
		this.setBackground(Color.white);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		bimg1 = new BufferedImage(img.getWidth(this), img.getHeight(this), BufferedImage.TYPE_INT_ARGB);
		bimg2 = new BufferedImage(img.getWidth(this), img.getHeight(this), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2D1 = bimg1.createGraphics();
		Graphics2D g2D2 = bimg2.createGraphics();
		g2D1.drawImage(img, 0, 0, this);
		g2D2.drawImage(img, 0, 0, this);
		g2D2.drawRect(1, 1, img.getWidth(this) - 3, img.getHeight(this) - 3);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		if (upState)
			g2D.drawImage(bimg1, x, y, this);
		else
			g2D.drawImage(bimg2,x, y, this);
	}

	public void mousePress(MouseEvent e) {
		if (e.getX() >= x && e.getX() < x + bimg1.getWidth(this) && e.getY() >= y
				&& e.getY() < y + bimg1.getHeight(this)) {
			upState = false;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			dx = e.getX() - x;
			cy = e.getY() - y;
			repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void MouseReleased(MouseEvent e) {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		upState = true;
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
		if (!upState) {
			x = e.getX() - dx;
			y = e.getY() - cy;
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}