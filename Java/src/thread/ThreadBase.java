package thread;

public class ThreadBase {

	public static void main(String[] args) {
		Runner1 r = new Runner1();
		//Thread t = new Thread(r);
		//t.start();
		r.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("MainThread-----------" + i);
		}
	}

}

//class Runner1 implements Runnable{
class Runner1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("runner1-----------------" + i);
		}
	}
	
}
