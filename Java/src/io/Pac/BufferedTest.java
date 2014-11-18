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
		bufferedInputStream();
		//bufferedTest();
	}
	
	/**
	 * 使用缓冲输入流读取
	 */
	public static void bufferedInputStream(){
		try {
			FileInputStream fis = new FileInputStream("F:\\a.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int b = 0;
			//System.out.println((char)bis.read());
			//System.out.println((char)bis.read());
			bis.mark(3);//设置标记，并指定在标记读取的最大限制(?)
			for(int i=0;(b=bis.read()) != -1;i++){
				System.out.print((char)b);
			}
			bis.reset();//重新标记到mark的位置
			System.out.println();
			for(int i=0;(b=bis.read()) != -1;i++){
				System.out.print((char)b);
			}
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用缓冲流写入并读取
	 */
	public static void bufferedTest(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\a.txt"));
			String s = null;
			for(int i=0;i<100;i++){
				s = String.valueOf(Math.random());
				bw.write(s);
				bw.newLine();//写入一行空行
			}
			bw.flush();//将缓冲区的数据写入文件
			
			while((s=br.readLine()) != null){//读取一行
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
