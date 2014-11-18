package base.apiMethods.object;
/**
 * Test class Object methods
 *
 */
public class ObjectTest {
	
	public static void toStringTest() {
		Dog d = new Dog();
		System.out.println("d:" + d); //d默认调用toString()
		Cat c = new Cat();
		System.out.println("c:" + c.toString());
	}
	
	public static void equalsTest() {
		Dog d1 = new Dog(1,"tom");
		Dog d2 = new Dog(1,"tom");
		System.out.println(d1.equals(d2));//Object的equals方法比较的是对象的引用
		System.out.println(d1 == d2);//==比较的是对象的引用
		String a = "yyy";
		String b = "yyy";
		System.out.println(a.equals(b));//String(Date)类重写了Object类的toString方法,比较的是字符串的内容是否相同
		System.out.println(a==b);
		
	}
	
	public static void main(String[] args) {
		//toStringTest();
		equalsTest();
	}

}

class Dog {
	public int color;
	public String name;
	
	public Dog(){}
	
	public Dog(int color,String name){
		this.color = color;
		this.name = name;
	}
}

class Cat {
	//重写toString()
	public String toString(){
		return "I am a cat.";
	}
}
