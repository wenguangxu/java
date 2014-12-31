package parttern;

/**
 * 单例模式
 * 提供对象的一个（而且只有一个）实例
 * @author wenguangxu
 *
 */
public class SingletonPattern {

	public static void main(String[] args) {
		Singleton s = Singleton.getHandle();
		System.out.println(s.getValue());
		Singleton s2 = Singleton.getHandle();
		s2.setValue(9);
		System.out.println(s.getValue());
		try {
			// Can't do this: compile-time error.
			// Singleton s3 = (Singleton)s2.clone();
		} catch (Exception e) {
		}
	}
}

//Java 也允许通过克隆（Clone）方式来创建一个对象,将类设为final 可禁止克隆的发生。
final class Singleton {

	private int i;

	private Singleton(int x) {
		i = x;
	}

	//静态创建对象
	private static Singleton s = new Singleton(47);

	public static Singleton getHandle() {
		return s;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int x) {
		i = x;
	}

}
