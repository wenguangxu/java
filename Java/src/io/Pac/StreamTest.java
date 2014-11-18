package io.Pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) {
		//fileInputStreamTest();
		fileOutputStreamTest();
	}
	
	/**
	 * 按字节读取文件内容
	 */
	public static void fileInputStreamTest(){
		FileInputStream in = null;
		try {
			in = new FileInputStream("F:\\a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("没有找到文件");
			e.printStackTrace();
		}
		int b = 0;
		int sum = 0;
		try {
			while((b=in.read()) != -1){
				System.out.print((char)b);
				sum++;
			}
			in.close();
			System.out.println();
			System.out.println("共读取了"+sum+"个字符");
		} catch (IOException e) {
			System.out.println("文件读取错误");
			e.printStackTrace();
		}
	}

	/**
	 * 先读再写(复制文件)
	 */
	public static void fileOutputStreamTest(){
		FileInputStream in = null;
		FileOutputStream out = null;
		int b = 0;
		
		try {
			in = new FileInputStream("F:\\a.txt");
			out = new FileOutputStream("F:\\b.txt");
			while((b=in.read()) != -1){
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("没有找到文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件复制错误");
			e.printStackTrace();
		}
		System.out.println("文件复制成功！");
	}
}
