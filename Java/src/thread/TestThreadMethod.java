package thread;
/**
 * 一个线程锁定一个方法，其他的线程可以访问其他没有锁定的方法
 * @author Administrator
 *
 */
public class TestThreadMethod implements Runnable{

	int b = 100;
	
	public synchronized void m1() throws Exception{
		b = 1000;
		Thread.sleep(5000);
		System.out.println("b=" + b);
	}
	
	public void m2(){
		System.out.println(b);
	}
	
	@Override
	public void run() {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestThreadMethod tt = new TestThreadMethod();
		Thread t = new Thread(tt);
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tt.m2();
	}
	
}
