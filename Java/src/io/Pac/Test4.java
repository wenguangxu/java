package io.Pac;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 一个文件随机读写的应用程序。程序把若干long 型整数写到一个名字为longData.dat 的文件中，然后按 相反顺序读出这些写入的整数。
 * 
 * @author Administrator
 * 
 */
public class Test4 {
	public static void main(String arg[]) {
		RandomAccessFile inOut = null;
		long data[] = { 151, 278, 235, 206, -170, 32, 43, 21, 83, 47 };
		try {
			inOut = new RandomAccessFile("src/io/files/longData.txt", "rw");
			for (int i = 0; i < data.length; i++) {
				inOut.writeLong(data[i]);
			}
			for (int i = data.length - 1; i >= 0; i--) {
				inOut.seek(i * 8);// long 型数据占８个字节，第i 个整数自i*8 字节开始
				System.out.print(" " + inOut.readLong()
						+ ((i == 0) ? "\n" : ","));
			}
			inOut.close();
		} catch (FileNotFoundException e1) {
			System.out.println("文件找不到！" + e1);
		} catch (IOException e2) {
			System.out.println("文件读写错误！" + e2);
		}
	}
}