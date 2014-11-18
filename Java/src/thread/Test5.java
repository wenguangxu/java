package thread;

/**
 * 20个线程操作同一个变量，使用synchronized控制方法
 * 
 * @author Administrator
 * 
 */
public class Test5 {
	public static void main(String arg[]) {
		ResourceClass mrc = new ResourceClass();
		Thread[] aThreadArray = new Thread[20];
		System.out.println("\t 刚开始的值是:" + mrc.getInfo());
		// 20 个线程＊每个线程加1000 次＊每次加50
		System.out.println("\t 预期的正确结果是:" + 20 * 1000 * 50);
		System.out.println("\t 多个线程正在工作，请稍等！");
		for (int i = 0; i < 20; i++) {// 产生20 个线程并开始执行
			aThreadArray[i] = new Thread(new MultiThreadClass(mrc));
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

class MultiThreadClass implements Runnable {
	ResourceClass useinteger;

	MultiThreadClass(ResourceClass mrc) {
		useinteger = mrc;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			useinteger.sumResource(50);
			try {
				Thread.sleep(10);// 做一些其他的处理
			} catch (InterruptedException e) {
			}
		}
	}
}

class ResourceClass {
	int IntegerResource;

	ResourceClass() {
		IntegerResource = 0;
	}

	public int getInfo() {
		return IntegerResource;
	}

	public void putInfo(int info) {
		IntegerResource = info;
	}

	synchronized void sumResource(int q) {
		int localInteger;
		localInteger = getInfo();// 把值取出来
		localInteger += q;
		putInfo(localInteger);// 把值存回去
	}
}