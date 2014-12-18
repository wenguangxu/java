package base.containerTest;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	private static Vector<String> v = new Vector<String>();
	
	public static void main(String[] args) {
		
		//add element
		for(int i=0; i<10;i++)
			v.addElement(String.valueOf(i));
		
		//remove element
		v.remove("3");
		
		//get element
		//System.out.println(v.elementAt(4));
		
		//print
		/*for (String s : v)
			System.out.println(s);*/
		
		//Enumeration Iterator
		Enumeration e = v.elements();
		while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
	}
}
