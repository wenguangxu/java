package base.containerTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set s = new HashSet();	
		s.add("hello");
		s.add("world");
		s.add("hello");//相同的元素不会被加入
		s.add("aa");
		System.out.println(s);
		test2();
	}
	
	public static void test2(){
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("d");s2.add("a");s2.add("b");
		Set sn = new HashSet(s1);
		sn.retainAll(s2);
		Set su = new HashSet(s1);
		su.addAll(s2);
		System.out.println(sn);
		System.out.println(su);
	}

}
