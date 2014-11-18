package gui.three;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.net.MalformedURLException;
import java.net.URL;

public class Test extends Applet{
	public void paint(Graphics g) {
		try {
			URL url = new URL("http://e.hiphotos.baidu.com/album/w%3D2048/sign=37173efbfe039245a1b5e60fb3aca5c2/5bafa40f4bfbfbed5fbdfe497af0f736afc31f24.jpg");
			Image myPicture = getImage(url);
			getGrayPicture((BufferedImage)myPicture);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage getGrayPicture(BufferedImage originalImage)  
    {  
        BufferedImage grayPicture;  
        int imageWidth = originalImage.getWidth();  
        int imageHeight = originalImage.getHeight();  
          
        grayPicture = new BufferedImage(imageWidth, imageHeight,     
                BufferedImage.TYPE_3BYTE_BGR);  
        ColorConvertOp cco = new ColorConvertOp(ColorSpace     
                .getInstance(ColorSpace.CS_GRAY), null);     
        cco.filter(originalImage, grayPicture);     
        return grayPicture;     
    }  
}
