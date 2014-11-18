package base.exceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		//test1();
		//test2();
		ExceptionTest e = new ExceptionTest();
		//e.get();
		//e.test5();
		A a = new B1();
		try {
			a.method();
		} catch (IOException e1) {
			System.out.println("查找文件出错。。。");
			e1.printStackTrace();
		}
	}
	
	
	public static void test1(){
		
		try{
			System.out.println(4/0);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
			e.printStackTrace();
		}
		
	}
	
	public static void test2(){
		
		try{
			System.out.println(4/0);
			System.out.println("aaa");//上面出错该句就不执行
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
			e.printStackTrace();
		}finally{
			System.out.println("test1 end...");
		}
		
		try{
			System.out.println("bbb");//上面的try语句出错该句继续执行
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
			e.printStackTrace();
		}finally{
			System.out.println("test2 end...");
		}
		
	}

	public void f(){
		try {
			FileInputStream fis = new FileInputStream("aa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void f2() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("aa.txt");
	}
	
	public void f3() throws FileNotFoundException{
		if(4/2==2){
			throw new FileNotFoundException("文件找不到！");
		}
	}
	
	public void get(){
		//f();
		/*try {
			f2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		try {
			f3();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/*
	 * catch捕获异常时先捕获小范围的异常，再捕获大范围的异常(或总的异常Exception),否则编译不通过。
	 */
	public void test3(){
		/*try {
			FileInputStream f = new FileInputStream("a.txt");
		} catch(Exception e1){
			e1.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}

	/**
	 * 测试自定义异常
	 * @param num
	 * @throws MyException
	 */
	public void test4(int num) throws MyException{
		if(num < 5){
			throw new MyException("数字不能小于5", 3);
		}
		System.out.println("aa");//当抛出异常时，此句不执行
	}
	
	public void test5(){
		try {
			test4(3);
		} catch (MyException e) {
			System.out.println("出错，数字小于5了");
			e.printStackTrace();
		}
	}
}

class A{
	public void method() throws IOException{
		System.out.println("A..");
	}
}

class B1 extends A{

	@Override
	public void method() throws FileNotFoundException {
		FileInputStream f = new FileInputStream("a.txt");
		System.out.println("B1...");
	}
	
}

class B2 extends A{

	/*@Override
	public void method() throws Exception {
		
	}*/
	
}

class B3 extends A{

	@Override
	public void method(){
		System.out.println("B3...");
	}
	
}

class B4 extends A{

	@Override
	public void method() throws IOException,FileNotFoundException{
		FileInputStream f = new FileInputStream("a.txt");
		System.out.println("B4...");
	}
	
}