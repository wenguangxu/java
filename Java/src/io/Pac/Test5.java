package io.Pac;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 应用程序逐行读取自己的源代码显示。程序利用getFilePointer()得到文件的当前位置，与fileLength() 文件的长度比较用于控制循环。
 * 
 * @author Administrator
 * 
 */
public class Test5 {
	public static void main(String[] args) {
		try {
			RandomAccessFile File = new RandomAccessFile("src/io/files/file2.txt","rw");
			long fileCurPos = 0;
			long fileLength = File.length();
			while (fileCurPos < fileLength) {
				String s = File.readLine();
				System.out.println(s);
				fileCurPos = File.getFilePointer();
			}
			File.close();
		} catch (FileNotFoundException e1) {
			System.out.println("文件找不到!" + e1);
		} catch (IOException e2) {
			System.out.println("文件读写错!" + e2);
		}
	}
}
