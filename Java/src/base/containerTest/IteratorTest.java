package base.containerTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("a");
		c.add("b");
		c.add("c");
		Iterator i = c.iterator();
		while(i.hasNext()){
			String n = (String)i.next();
			System.out.println(n);
		}
	}

}
