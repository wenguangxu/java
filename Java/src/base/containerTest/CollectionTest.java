package base.containerTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	/**
	 * Java 中集合的类型：
	 * Vector ： access 类型 ： 数组
	 * BitSet
	 * Stack ： LIFO 继承了Vector
	 * Dictionary ： 字典抽象类
	 * HashTable ： 继承Dictionary 散列表； 键值对存储；其中存储的对象一般要实现hashCode() 和 equals() 方法
	 */
	
	/**
	 * 集合的遍历：
	 * 枚举类 ： Enumeration
	 */
	
	public static void main(String[] args) {
		Collection c = new ArrayList();//c引用看不见ArrayList中的自己的方法，这样写方便更换容器
		//可以放入不同类型的变量
		c.add("Hello");
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);
	}

}
