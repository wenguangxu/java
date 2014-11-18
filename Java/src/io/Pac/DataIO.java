package io.Pac;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataIO {
	
	public static void main(String[] args) {
		dataIoTest();
	}

	public static void dataIoTest(){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//在内存中构建字节数组
		DataOutputStream dos = new DataOutputStream(baos);//用数据流包装
		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			System.out.println(bais.available());//输出可以读取的长度
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			dos.close(); dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
