package base.containerTest.generic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 除了异常类型、枚举或匿名内部类以外，任何类都可以具有类型参数。
 * 
 * 	命名类型参数
	推荐的命名约定是使用大写的单个字母名称作为类型参数。对于常见的泛型模式，推荐的名称是：
	
	K —— 键，比如映射的键。 
	V —— 值，比如 List 和 Set 的内容，或者 Map 中的值。 
	E —— 异常类。 
	T —— 泛型。
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("key", "blarg");
		String s = m.get("key");
		
		String a = ifThenElse(true, "a", "b");
		Integer b = ifThenElse(true, new Integer(1), new Integer(2));
		//String c = ifThenElse(false, "pi", new Float(3.14)); //error
		
		Matrix<Integer> m1 = new Matrix<Integer>();
		Matrix<Float> m2 = new Matrix<Float>();
		//Matrix<String> m3 = new Matrix<String>(); //error
	}
	
	/**
	 * 泛型通配符
	 * 代码中的问号是一个类型通配符。它读作“问号”。List<?> 是任何泛型 List 的父类型，所以您完全可以将 List<Object>、List<Integer> 或 List<List<List<Flutzpah>>> 传递
	 * @param i
	 */
	public static void typeMatch(List<?> i) {
		for (Object o : i) {
			System.out.println(o);
		}
	}
	
	public static <T> T ifThenElse(Boolean b, T first, T second) {
		return b ? first : second;
	}
}

/**
 * 有限制类型
 * 类型参数 V 被判断为由 Number 限制 。在没有类型限制时，假设类型参数由 Object 限制。
 *
 */
class Matrix<V extends Number> {
	
}
