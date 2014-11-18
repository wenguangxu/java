package io.Pac;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTest {

	public static void main(String[] args) {
		FileReaderTest();
		//FileWriterTest();
	}

	/**
	 * 读取文件
	 */
	public static void FileReaderTest(){
		FileReader reader = null;
		try {
			reader = new FileReader("F:\\a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("没有找到文件");
			e.printStackTrace();
		}
		try {
			int b = 0;
			while((b=reader.read()) != -1){
				System.out.print((char)b);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("读取失败");
			e.printStackTrace();
		}
	}

	/**
	 * 先读再写(复制文件内容)
	 */
	public static void FileWriterTest(){
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("F:\\a.txt");
			writer = new FileWriter("F:\\b.txt");
			int b = 0;
			while((b=reader.read()) != -1){
				writer.write(b);
			}
			reader.close();
			writer.close();
			System.out.println("复制成功");
		} catch (FileNotFoundException e) {
			System.out.println("文件未找到");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("复制出错");
			e.printStackTrace();
		}
	}
}
