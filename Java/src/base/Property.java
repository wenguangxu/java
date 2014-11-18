package base;

import java.util.*;
/**
 * @des 第一个java程序
 * @author wenguang.xu
 * @see Property#main(StringDemo[])
 */
public class Property {
	/**
	 * main方法
	 * <b style="color : red;">main方法</b>
	 * @param args 参数名
	 * @return 返回值
	 * @deprecated 标识该方法为旧功能
	 * @exception 异常
	 */
	public static void main(String[] args){
		//暂停5秒后执行
		try {
			Thread.currentThread().sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);//输出系统版本信息
		
		System.out.println("Memory Usage :");
		Runtime rt = Runtime.getRuntime();
		System.out.println("总内存：" + rt.totalMemory() + "空闲内存:" + rt.freeMemory());
	}
}
