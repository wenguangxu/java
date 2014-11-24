package dataStructure;

import java.math.BigInteger;

/**
 * 数据结构
 * @author wenguang.xu
 *
 */
public class DataStructure {
	//1、布尔类型
	boolean b = true;
	//2、字符型(普通字符、转义字符)
	char c = '我';
	//	转义符 含义
	//	\b 退格(Backspace 键)
	//	\n 换行符，光标位置移到下一行首
	//	\r 回车符，光标位置移到当前行首
	//	\t 水平制表符(Tab 键)
	//	\v 竖向退格符
	//	\f 走纸换页
	//	\\ 反斜杠符\
	//	\’ 单引号符’
	//	\” 双引号符”
	//	杠nnnn 为8 进制数字，用八进制数据表示字符的代码
	//	杠unnnnn 为16 进制数字，用16 进制数据表示字符的代码
	static char backSpace = '\b';
	static char line = '\n';
	static char back = '\r';
	static char tab = '\t';
	//static char v = '\v';
	static char f = '\f';
	static char gang = '\\';
	static char dan = '\'';
	static char shuang = '\"';
	
	//3、整形
	int 整形=0;
	//4、浮点型
	//单精度
	float flo = 89.798f;
	//双精度
	static double d = 78.233d;
	static double dou = 2e2;
	
	//基本类和基本类型的转换
	public static void parse(){
		Integer l = new Integer(123);
		System.out.println(l);
		Double dou = new Double(234.1);
		System.out.println(dou);
		Integer inte = 4;
		int integer = inte.intValue();
	}
	
	public static void main(String args[]){
		/*System.out.println("a"+backSpace+"b");
		System.out.println("a"+line+"b");
		System.out.println("a"+back+"b");
		System.out.println("a"+tab+"b");
		System.out.println("a"+f+"b");
		System.out.println("a"+gang+"b");
		System.out.println("a"+dan+"b");
		System.out.println("a"+shuang+"b");*/
		//parse();
		
	}
	
	

}
