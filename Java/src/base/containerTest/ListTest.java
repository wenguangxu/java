package base.containerTest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List l1 = new LinkedList();
		for (int i = 0; i <= 5; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		l1.add(3,"a100");
		System.out.println(l1);
		l1.set(6, "a200");
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.indexOf("a3"));
		l1.remove(1);
		System.out.println(l1);
		ContainsTest();
	}
	
	public static void ContainsTest(){
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		for(int i=0;i<=9;i++){
			l1.add("a"+i);
		}
		System.out.println(l1);
		Collections.shuffle(l1);//随机排列
		System.out.println(l1);
		Collections.reverse(l1);//逆序排列
		System.out.println(l1);
		Collections.sort(l1);//排序(从小到大)
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1, "a3"));
		
	}

}
