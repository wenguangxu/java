package thread;
/**
 * 模拟死锁
 * @author Administrator
 *
 */
public class TestDeadLock implements Runnable{

	public int flag = 1;
	static Object o1 = new Object(),o2 = new Object();
	public void run(){
		System.out.println("flag=" + flag);
		if(flag == 1){
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("完成");
				}
			}
		}
		if(flag == 2){
			synchronized (o2) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("成功");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TestDeadLock t1 = new TestDeadLock();
		TestDeadLock t2 = new TestDeadLock();
		t1.flag=1;
		t2.flag=2;
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}
}


