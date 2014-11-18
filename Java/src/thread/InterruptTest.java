package thread;

import java.util.Date;
/**
 * 当前线程睡眠10秒后截断另一个线程(不推荐用interrupt方法，stop方法更不推荐)
 * @author Administrator
 *
 */
public class InterruptTest {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
	}

}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("======="+new Date()+"=======");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}