package base.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		//简单认识正则表达式概念
		
		/*p("abc".matches("..."));
		p("a9876a".replaceAll("\\d", "-"));
		Pattern p = Pattern.compile("[a-z]{3}");//编译一个正则表达式(编译后匹配比较快)
		Matcher m = p.matcher("kjh");//返回匹配的结果(可能有多个)
		p(m.matches());//打印是否匹配*/
		
		//初步认识 . * + ?
		/*p("a".matches("."));
		p("aa".matches("aa"));
		p("aaaa".matches("a*"));
		p("aaaa".matches("a+"));
		p("".matches("a*"));
		p("aaaa".matches("a?"));
		p("".matches("a?"));
		p("a".matches("a?"));
		p("9875678990876".matches("\\d{3,100}"));
		p("192.168.0.33".matches("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}"));
		p("192".matches("[0-2][0-9][0-9]"));*/
		
		//范围
		/*p("a".matches("[abc]"));//是abc中的一个
		p("a".matches("[^abc]"));//不是abc中的一个
		p("A".matches("[a-zA-z]")); p("A".matches("[a-z]|[A-z]")); p("A".matches("[a-z[A-z]]"));
		p("R".matches("[A-Z&&[RFG]]"));*/
		
		//认识 \s \w \d \
		/*p(" \n\r\t".matches("\\s{4}"));
		p(" ".matches("\\S"));
		p("a_8".matches("\\w{3}"));
		p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
		p("\\".matches("\\\\"));//在正则表达式中用4个\代表\\
		*/
		
		//POSIX style
		/*p("a".matches("\\p{Lower}"));*/
		
		//Boundary (边界处理)
		/*p("hello sir".matches("^h.*"));
		p("hello sir".matches(".*ir$"));
		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));// \b 一个单词的边界
		p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));*/
		
		//白色空行
		//p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
		
		//Email
		//p("wenger_xu@qq.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		//matches find lookingAt
		/*Pattern p = Pattern.compile("\\d{3,5}");
		String s = "123-34345-234-00";
		Matcher m = p.matcher(s);
		p(m.matches());//进行匹配,并从主串中割掉从开头到正在匹配的子串
		m.reset();//恢复原来状态(恢复成s)
		
		p(m.find());//查找s的子串，找到则从主串中割掉找到的子串
		p(m.start() + "-" + m.end());//找到匹配的子串的索引，没有找到匹配的则抛出异常
		p(m.find());//查找剩余的子串
		p(m.start() + "-" + m.end());
		p(m.find());
		p(m.start() + "-" + m.end());
		p(m.find());
		
		p(m.lookingAt());//总是从主串的开头开始查找，不割断
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());*/
		
		//replacement(字符串替换)
		/*Pattern p = Pattern.compile("java",Pattern.CASE_INSENSITIVE);//忽略大小写编译
		Matcher m = p.matcher("java Java JAVa JaVa IloveJAVA you hateJava dskfjldsk");
		StringBuffer buf = new StringBuffer();
		int i = 0;
		while(m.find()){
			i++;
			if(i%2==0){
				m.appendReplacement(buf, "java");
			}else{
				m.appendReplacement(buf, "JAVA");
			}
		}
		m.appendTail(buf);//添加尾巴到buf
		p(buf.toString());*/
		
		//group(分组)
		/*Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
		String s = "123aa-34345bb-234cc-00";
		Matcher m = p.matcher(s);
		while(m.find()){
			p(m.group(1));//将匹配的子串分组
		}*/
		
		
		//qulifiers
		//Pattern p = Pattern.compile(".{3,10}[0-9]");//Greedy qulifiers(贪婪的)
		//Pattern p = Pattern.compile(".{3,10}?[0-9]");//Reluctant qulifiers(不情愿的，按最少的匹配，先读取对少的3个，不匹配再逐个增加)
		Pattern p = Pattern.compile(".{3,10}+[0-9]");//Possessive qulifiers(独占性的，按最多的匹配，先读取最多的10个)
		String s = "aaaa5bbbb6";
		Matcher m = p.matcher(s);
		if(m.find()){
			p(m.start() + "-" + m.end());
		}else{
			p("not match");
		}
		
		
		//non-capturing groups
		/*
		Pattern p = Pattern.compile(".{3}(?=a)");
		String s = "444a66b";
		Matcher m = p.matcher(s);
		while(m.find()) {
			p(m.group());
		}
		*/
		
		//back refenrences
		/*
		Pattern p = Pattern.compile("(\\d(\\d))\\2");// \\2:和前一组匹配的字符一样
		String s = "122";
		Matcher m = p.matcher(s);
		p(m.matches());
		*/
		
		//flags的简写
		//Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		p("Java".matches("(?i)(java)"));
	
	}
	
	/**
	 * 打印方法
	 * @param o
	 */
	public static void p(Object o){
		System.out.println(o);
	}
}
