package base;

import java.util.Random;

/**
 * 运算符
 * @author wenguang.xu
 * @date 2013/06/25
 */
public class Operator {
	public static void main(String[] args) {
		/*Random random = new Random();
		int i = random.nextInt() % 100;
		int j = random.nextInt() % 100;
		System.out.println("i=" + i);
		System.out.println("j=" + j);*/
		//扩展赋值运算符
		/*i %= j;
		System.out.println("i %= j |" + i);*/
		/*i += j;
		System.out.println("i += j |" + i);*/
		/*i -= j;
		System.out.println("i -= j |" + i);*/
		/*i *= j;
		System.out.println("i *= j |" + i);*/
		/*i  /= j;
		System.out.println("i /= j |" + i);*/
		
		//递增(递减)运算符(分前缀和后缀)
		//System.out.println(++i);//先加再输出
		//System.out.println(i++);//先输出再加
		//System.out.println(j--);
		//System.out.println(--j);
		
		//关系运算符
		/*Integer n1 = new Integer("47");
		Integer n2 = new Integer("47");
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1.equals(n2));*/
		/*System.out.println(i > j);
		System.out.println(i >= j);
		System.out.println(i <  j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);*/
		
		//逻辑运算符
		boolean a = true;
		boolean b = true;
		boolean c = false;
		boolean d = false;	
		System.out.println(!a);//逻辑非
		System.out.println(a & b);//逻辑与
		System.out.println(a | b);//逻辑或
		System.out.println(a ^ b);//逻辑异或(两个不一样是true)
		System.out.println(a && b);//短路与(左边能确定结果的话右边就不再计算了)
		System.out.println(a || b);//短路或(左边能确定结果的话右边就不再计算了)
		
		
		//位运算符
		
		
		 
	}
}
