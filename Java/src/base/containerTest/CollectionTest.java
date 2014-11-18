package base.containerTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();//c引用看不见ArrayList中的自己的方法，这样写方便更换容器
		//可以放入不同类型的变量
		c.add("Hello");
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);
	}

}
