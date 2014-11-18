package io.Pac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintIO {

	public static void main(String[] args) {
		//test1();
		//test2(args);
		test3();
	}
	
	/**
	 * 用打印流向文件中打印
	 */
	public static void test1(){
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("F:\\a.txt");
			ps = new PrintStream(fos);
			if(ps != null){
				System.setOut(ps);
			}
			for(char i=0;i<60000;i++){
				System.out.print(i+" ");
			}
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 读取传入文件中的内容
	 * @param args
	 */
	public static void test2(String[] args){
		String fileName = args[0];
		if(fileName != null){
				try {
					BufferedReader br = new BufferedReader(new FileReader(fileName));
					String s = null;
					while((s=br.readLine()) != null){
						PrintStream ps = new PrintStream(System.out);
						ps.println(s);
					}
					br.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void test3(){
		try {
			String s = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("F:\\a.txt");
			PrintWriter log = new PrintWriter(fw);
			while((s=br.readLine()) != null){
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				log.println("--------");
				log.println(s.toUpperCase());
				log.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
