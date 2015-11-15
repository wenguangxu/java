package base;

public class StringDemo {
	//1、声明和创建
	String a = new String();
	String b = new String("123");
	
	//根据字符数组创建
	char[] c = {1,2,3};
	String d = new String(c);
	
	//根据字符数组的起始下标位置以及字符个数创建字符串
	char[] e = {1,2,3,4,5};
	String f = new String(e,2,2);
	
	//2、字符串基本操作
	
	//字符串连接( + 或concat())
	String g = "1";
	String h = "2";
	String i = g + h;
	String j = g.concat(h);
	//获取字符串长度length()
	int k = j.length();
	//字符串常量也可以用length()方法
	int l = "aaa".length();
	//字符串前缀或后缀的比较
	String m = "abc";
	boolean n = m.startsWith("a");
	boolean o = m.endsWith("c");
	//比较两个字符串是否相同
	boolean p = i.equals(j);
	boolean q = i.equalsIgnoreCase(j);
	boolean r = i == j;
	int s = i.compareTo(j);//方法按字典顺序与参数another 字符串比较大小。代码s1.compareTo(s2)，如果s1 和s2 相同，方法返回值0；如果s1 大于s2，方法返回正值；如果s1 小于s2，方法返回负值。
	int t = i.compareToIgnoreCase(j);
	//字符串检索
	String u = "abcdefg";
	int v = u.indexOf("c");
	int w = u.indexOf("f",2);
	
	//取字符串的子串
	String x = u.substring(3);
	String y = u.substring(2,3);
	
	//替换字符串的某字符得到一个新字符串
	String z = u.replace("b", "bb");
	//去掉前后空格得到一个新字符串
	String aa = a.trim();
	
	//基本类型值的字符串表示
	double bb = 23.4;
	boolean cc = false;
	String dd = String.valueOf(bb);
	String ee = String.valueOf(cc);
	
	//字符串得到基本类型对象
	Double ff = Double.valueOf(x);
	//字符串得到基本类型值
	double gg = Double.parseDouble(u);
	
	public static void main(String[]args){
		//test compareTo()
		String a = "g";
		String b = "a";
		System.out.println(a.compareTo(b));
	}
	
	//字符串与字节数组
	byte jj[] = {'a','b','c','d'};
	String ii = new String(jj);
	String kk = new String(jj);
	byte[] ll = kk.getBytes();
	
	//StringBuilder 比new String 效率更高
	StringBuffer str = new StringBuffer();
	public void testSB() {
		str.append("a");
		str.append("b");
		System.out.println(str.toString());
	}
	
	//格式化字符串
	String name = "张三";
	int age = 20;
	String msg = String.format("Hello,%s.next year,you'll be %d", name,age);
}
