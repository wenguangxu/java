package thread;

class SalesLady {
	int memontoes, five, ten;

	public synchronized String ruleForSale(int num, int money) {
		String s = null;
		if (memontoes == 0)
			return "对不起,已售完!";
		if (money == 5) {
			memontoes--;
			five++;
			s = "给你一个纪念品," + "你的钱正好.";
		} else if (money == 10) {
			while (five < 1) {
				try {
					System.out.println("" + num + "号顾客用10 元钱购票,发生等待!");
					wait();
				} catch (InterruptedException e) {
				}
			}
			memontoes--;
			five -= 1;
			ten++;
			s = "给你一个纪念品," + "你给了十元,找你5 元.";
		}
		notify();
		return s;
	}

	SalesLady(int m, int f, int t) {
		memontoes = m;
		five = f;
		ten = t;
	}
}

public class Test6 extends java.applet.Applet {
	static SalesLady salesLady = new SalesLady(14, 0, 0);

	public void start() {
		int moneies[] = { 10, 10, 5, 10, 5, 10, 5, 5, 10, 5, 10, 5, 5, 10, 5 };
		Thread[] aThreadArray = new Thread[20];
		System.out.println("现在开始购票");
		for (int i = 0; i < moneies.length; i++) {
			aThreadArray[i] = new Thread(new CustomerClass(i + 1, moneies[i]));
			aThreadArray[i].start();
		}
		WhileLoop: while (true) {
			for (int i = 0; i < moneies.length; i++)
				if (aThreadArray[i].isAlive())
					continue WhileLoop;
			break;
		}
		System.out.println("购票结束！");
	}
}

class CustomerClass implements Runnable {
	int num, money;// 顾客序号，钱的面值

	public void run() {
		try {
			Thread.sleep(10);
		}// 假定顾客在购买前还做一些其他的事
		catch (InterruptedException e) {
		}
		System.out.println("我是" + num + "号顾客，用" + money + "元购纪念品，售货员说："
				+ Test6.salesLady.ruleForSale(num, money));
	}

	CustomerClass(int n, int m) {
		num = n;
		money = m;
	}
}
