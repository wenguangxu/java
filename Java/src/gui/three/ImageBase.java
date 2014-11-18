package gui.three;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
/**
 * 图像显示
 * @author wenguang.xu
 *
 */
public class ImageBase extends Applet{
	private Toolkit tool = getToolkit();
	
	public void paint(Graphics g){
		try{
			URL u = getCodeBase();//取小应用程序文件所在的位置。
			URL u2 = getDocumentBase();//取HTML 文件所在的位置。
			System.out.println(u);
			//指明文件的位置和文件名
			URL url = new URL("http://e.hiphotos.baidu.com/album/w%3D2048/sign=37173efbfe039245a1b5e60fb3aca5c2/5bafa40f4bfbfbed5fbdfe497af0f736afc31f24.jpg");
			URL url2 = new URL("http://e.hiphotos.baidu.com/album/w%3D2048/sign=37173efbfe039245a1b5e60fb3aca5c2/");
			//Image image = tool.getImage(url);//使用ToolKit的getImage
			//Image image = getImage(url);//使用Applet的getImage
			Image image = getImage(url2,"5bafa40f4bfbfbed5fbdfe497af0f736afc31f24.jpg");//使用Applet的getImage,将URL分开
			//g.drawImage(image, 0, 0, this);//原图显示
			//g.drawImage(image,0,0,Color.yellow,this);//图形加底色显示
			g.drawImage(image, 0, 0, 100, 100, this);//缩放显示
			System.out.println(image.getWidth(this));
			System.out.println(image.getHeight(this));
		}catch(Exception e){
			System.out.println("URL加载错误！");
		}
		
	}
	
}
