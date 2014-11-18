package io.Pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 从文件中读取Objec对象
 * @author Administrator
 *
 */
public class ObjectIO {

	public static void main(String[] args) {
		T t = new T();
		t.k = 8;
		try {
			FileOutputStream fos = new FileOutputStream("F:\\a.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("F:\\a.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			T t2 = (T)ois.readObject();
			System.out.println(t2.i + " " +t2.j + " " +t2.d + " " + t2.k);
			ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}

class T implements Serializable{//序列化 表示对象可以被写入文件
	int i = 10;
	int j = 9;
	double d = 2.3;
	transient int k = 15;//透明的，不参与序列化
}
