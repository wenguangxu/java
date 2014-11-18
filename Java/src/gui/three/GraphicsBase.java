package gui.three;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * Graphics类的基本功能
 * 
 * @author Administrator
 * 
 */
public class GraphicsBase extends Applet {
	Font f1 = new Font("细明体", Font.BOLD, 12);// 设置字体(字体、风格、字号)

	public void paint(Graphics g) {
		//base(g);
		//drawLine(g);
		//drawRect(g);
		//drawRound(g);
		//draw3dRect(g);
		//drawOval(g);
		//drawArc(g);
		//drawPolygon(g);
		//clearRect(g);
		//cliprect(g);
		copyarea(g);
	}
	
	/**
	 * 绘制基础
	 * @param g 画笔
	 */
	public void base(Graphics g){
//		System.out.println(f1.getSize());// 获取字体大小
//		System.out.println(f1.getStyle());// 获取字体风格
//		System.out.println(f1.getName());// 获取字体名称
//		System.out.println(f1.isPlain());// 获取是否正常字体
//		System.out.println(f1.isBold());// 获取是否加粗字体
//		System.out.println(f1.isItalic());// 获取是否斜体字体
		g.setFont(f1);
		// g.setColor(Color.blue);//设置颜色
		g.setColor(new Color(34, 123, 255));// 按RGB设置颜色(0-255)
		System.out.println(g.getColor());// 获取颜色
		//setBackground(Color.red);// 设置背景
		System.out.println(getBackground());// 获取背景色
		//g.setPaintMode();//设置绘图模式为正常模式(覆盖模式),此为默认模式
		//g.setXORMode(Color.blue);//设置绘图模式为异或模式，参数为异或模式设定的绘图颜色
		g.drawString("a", 20, 30);// 在指定的位置显示字符串。
		char[] a = { 'b', 'c', '3', '4', '5' };
		g.drawChars(a, 0, 3, 20, 30);// 在指定的位置显示字符数组中的文字，从字符数组的offset
										// 位置开始，最多显示length 个字符。
		byte[] b = { 'a', 'b', 'c', 'd' };
		g.drawBytes(b, 0, 3, 50, 60);// 在指定的位置显示字符数组中的文字，从字符数组的offset
										// 位置开始，最多显示length 个字符。
	}
	
	/**
	 * 画线段和点
	 * @param g
	 */
	public void drawLine(Graphics g){
		g.drawLine(1, 3, 100, 100);
		g.setFont(new Font("楷体",Font.BOLD,10));
		g.drawLine(200, 200, 200, 200);
	}
	
	/**
	 * 画矩形(普通型、圆角型)
	 * @param g
	 */
	public void drawRect(Graphics g){
//		g.drawRect(100, 100, 200, 100);//普通矩形
		g.setColor(Color.yellow);
//		g.fillRect(300, 300, 100, 50);//画带颜色的矩形(画笔的颜色)
		g.drawRoundRect(50, 50, 100, 50, 20, 20);//画普通圆角矩形
		g.fillRoundRect(100, 100, 100, 50, 20, 20);//画带颜色的圆角矩形
	}
	
	/**
	 * 画圆
	 * @param g
	 */
	public void drawRound(Graphics g){
		//1、根据矩形的画法
		g.drawRoundRect(20, 20, 100, 100, 100, 100);//画圆
		g.setColor(Color.blue);
		g.fillRoundRect(40, 40, 100, 100, 100, 100);//填充圆
		//2、根据椭圆的画法
		g.drawOval(150, 20, 100, 100);
		g.fillOval(150, 40, 100, 100);
	}
	
	/**
	 * 画三维矩形
	 * @param g
	 */
	public void draw3dRect(Graphics g){
		g.draw3DRect(20, 20, 200, 100, true);//画一个突出的三维矩形
		g.setColor(Color.yellow);
		g.fill3DRect(40, 40, 200, 100, true);//填充一个突出的三维矩形
	}

	/**
	 * 画椭圆形
	 * @param g
	 */
	public void drawOval(Graphics g){
		g.drawOval(20, 20, 100, 50);
		g.setColor(Color.yellow);
		g.fillOval(40, 40, 100, 50);
	}
	
	/**
	 * 画圆弧
	 * @param g
	 */
	public void drawArc(Graphics g){
		g.drawArc(20, 20, 100, 50, 0, 180);//顺时针0度到180度
		g.setColor(Color.red);
		g.fillArc(100, 100, 100, 50, 0, 180);//顺时针0度到180度
		g.fillArc(100, 100, 100, 50, 0, -180);//逆时针0度到180度
	}
	
	/**
	 * 画多边形
	 * @param g
	 */
	public void drawPolygon(Graphics g){
		/*int x[] ={50,100,150,50};
		int y[] ={50,0,50,50};
//		int x[] ={10,60,140,10};
//		int y[] ={200,20,100,200};
		//g.drawPolygon(x, y, 4);
		g.setColor(Color.yellow);
		g.fillPolygon(x, y, 4);*/
		
		//2、用多边形对象画多边形
		int x[]={140,180,170,180,140,100,110,100};
		int y[]={5,25,35,45,65,45,35,25};
		Polygon ponlygon1=new Polygon();
		ponlygon1.addPoint(50,10);ponlygon1.addPoint(90,50);
		ponlygon1.addPoint(10,50);g.drawPolygon(ponlygon1);
		g.setColor(Color.yellow);
		Polygon polygon2 = new Polygon(x,y,8);
		g.fillPolygon(polygon2);
	}

	/**
	 * 擦出矩形块
	 * @param g
	 */
	public void clearRect(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(50,50,100,100);
		g.clearRect(70,70,40,55);
	}
	
	/**
	 * 限制作图显示区域
	 * @param g
	 */
	public void cliprect(Graphics g){
		g.clipRect(100,100,100,100);
		g.setColor(Color.blue);
		g.fillOval(0,0,500,500);
		
		//g.clipRect(50,25,100,50);
	}
	
	/**
	 * 复制图形
	 * @param g
	 */
	public void copyarea(Graphics g){
		g.drawRect(10,10,60,90);
		g.fillRect(90,10,60,90);
		g.copyArea(40,50,60,70,-20,80);
		g.copyArea(110,50,60,60,10,80);
	}
	
	
}
