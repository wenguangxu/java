package thread;
/**
 * 20个线程操作同一个变量，结果出错
 * @author Administrator
 *
 */
public class Test4 {
	public static void main(String arg[]) {
		MyResourceClass mrc = new MyResourceClass();
		Thread[] aThreadArray = new Thread[20];
		System.out.println("\t 刚开始的值是:" + mrc.getInfo());
		// 20 个线程＊每个线程加1000 次＊每次加50
		System.out.println("\t 预期的正确结果是:" + 20 * 1000 * 50);
		System.out.println("\t 多个线程正在工作，请稍等！");
		for (int i = 0; i < 20; i++) {// 产生20 个线程并开始执行
			aThreadArray[i] = new Thread(new MyMultiThreadClass(mrc));
			aThreadArray[i].start();
		}
		WhileLoop: // 等待所有线程结束
		while (true) {
			for (int i = 0; i < 20; i++)
				if (aThreadArray[i].isAlive())
					continue WhileLoop;
			break;
		}
		System.out.println("\t 最后结果是:" + mrc.getInfo());
	}
}

class MyMultiThreadClass implements Runnable {
	MyResourceClass useinteger;

	MyMultiThreadClass(MyResourceClass mrc) {
		useinteger = mrc;
	}

	public void run() {
		int i, LocalInteger;
		for (i = 0; i < 1000; i++) {
			LocalInteger = useinteger.getInfo();// 把值取出来
			LocalInteger += 50;
			try {
				Thread.sleep(10);// 做一些其他的处理
			} catch (InterruptedException e) {
			}
			useinteger.putInfo(LocalInteger);// 把值存回去
		}
	}
}

class MyResourceClass {
	int IntegerResource;

	MyResourceClass() {
		IntegerResource = 0;
	}

	public int getInfo() {
		return IntegerResource;
	}

	public void putInfo(int info) {
		IntegerResource = info;
	}
}