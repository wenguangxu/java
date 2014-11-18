package io.Pac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransferStream {

	public static void main(String[] args) {
		//outputStreamWriterTest();
		inputStreamReader();
	}

	/**
	 * 转换输出字节流为输出字符流
	 */
	public static void outputStreamWriterTest(){
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"));
			osw.write("abcd123哈哈");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt",true),"UTF-8");
			osw.write("ghjkl");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 转换输入字节流为输入字符流，并用缓冲输入流封装
	 */
	public static void inputStreamReader(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try {
			s = br.readLine();
			while(s != null){
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				s = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
