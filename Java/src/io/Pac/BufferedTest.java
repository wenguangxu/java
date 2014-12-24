package io.Pac;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		//bufferedInputStream();
		bufferedTest();
	}

	/**
	 * 使用缓冲输入流读取(不支持中文)
	 */
	public static void bufferedInputStream() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("src/io/files/file1.txt");
			bis = new BufferedInputStream(fis);
			int b = 0;
			while ((b = bis.read()) != -1) {
				System.out.println((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 使用缓冲流读写文件(支持中文)
	 */
	public static void bufferedTest() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/io/files/file1.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/io/files/file1.txt"));
			String s = null;
			for (int i = 0; i < 100; i++) {
				s = String.valueOf(Math.random());
				bw.write(s);
				bw.newLine();// 写入一行空行
			}
			bw.flush();// 将缓冲区的数据写入文件

			//读取文件
			while ((s = br.readLine()) != null) {// 读取一行
				System.out.println(s);
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
