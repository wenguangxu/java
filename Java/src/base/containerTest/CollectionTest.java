package base.containerTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	/**
	 * Java 中集合的类型：
	 * Vector ： access 类型 ： 数组 (由ArrayList替代)
	 * BitSet
	 * Stack ： LIFO 继承了Vector
	 * Dictionary ： 字典抽象类
	 * HashTable ： 继承Dictionary 散列表； 键值对存储；其中存储的对象一般要实现hashCode() 和 equals() 方法
	 */
	
	/**
	 * 新集合：
	 * 
	 * List(接口) 有序；可以存在重复值；
	 * ArrayList : 访问快，增删慢
	 * LinkedList : 访问慢，增删快
	 * 
	 * Set(接口) 无序；元素是唯一的 。 添加到Set 的每个元素都必须是独一无二的；否则Set 就不会添加重复的元素。添加到Set 里的对象必须定义equals()，从而建立对象的唯一性。
	 * *HashSet ： 用于除非常小的以外的所有Set。对象也必须定义hashCode()
	 * ArraySet ： 由一个数组后推得到的Set。面向非常小的Set 设计，特别是那些需要频繁创建和删除的。对于小
	 * 			Set，与HashSet 相比，ArraySet 创建和反复所需付出的代价都要小得多。但随着Set 的增大，它的性能
	 * 			也会大打折扣。不需要HashCode()
	 * TreeSet ： 由一个“红黑树”后推得到的顺序Set。这样一来，我们就可以从一个Set 里提到一个顺序集合
	 * 
	 * Map
	 * *HashMap : 基于一个散列表实现（用它代替Hashtable）
	 * ArrayMap : 由一个ArrayList 后推得到的Map。对反复的顺序提供了精确的控制。
	 * 			面向非常小的Map 设计，特别是那些需要经常创建和删除的。对于非常小的Map，创建和反复所付出的代价要比HashMap 低得多。
	 * 			但在Map 变大以后，性能也会相应地大幅度降低
	 * TreeMap : 在一个“红－黑”树的基础上实现。查看键或者“键－值”对时，它们会按固定的顺序排列（取决于Comparable 或Comparator，稍后即会讲到）。
	 * 			TreeMap 最大的好处就是我们得到的是已排好序的结果。
	 * 			TreeMap 是含有subMap()方法的唯一一种Map，利用它可以返回树的一部分
	 */
	
	/**
	 * 集合的遍历：
	 * 枚举类 ： Enumeration (由Iterator替代)
	 */
	
	
	/**
	 * 工具类 (排序和搜索)
	 * 
	 * Arrays
	 * Collections
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
