package parttern;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * Observer Pattern 观察者模式
 * 
 * @author wenguangxu
 *
 */

/**
 * 在Java 中，有两种类型的对象用来实现观察器范式。
 * 其中，Observable 类用于跟踪那些当发生一个改变时希望收到通知的所有个体——无论“状态”是否改变。如果有人说“好了，所有人都要检查自己，并可能要进行更新”，
 * 那么Observable 类会执行这个任务——为列表中的每个“人”都调用notifyObservers()方法。notifyObservers()方法属于基础类Observable 的一部分。
 * 在观察器范式中，实际有两个方面可能发生变化：观察对象的数量以及更新的方式。也就是说，观察器范式允许我们同时修改这两个方面，不会干扰围绕在它周围的其他代码。
 *
 */
public class BoxObserver extends Frame {

	Observable notifier = new BoxObservable();

	public BoxObserver(int grid) {
		setTitle("Demonstrates Observer pattern");
		setLayout(new GridLayout(grid, grid));
		for (int x = 0; x < grid; x++)
			for (int y = 0; y < grid; y++)
				add(new OCBox(x, y, notifier));
	}

	public static void main(String[] args) {
		int grid = 8;
		if (args.length > 0)
			grid = Integer.parseInt(args[0]);
		Frame f = new BoxObserver(grid);
		f.setSize(500, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class BoxObservable extends Observable {

	@Override
	public void notifyObservers(Object b) {
		setChanged();
		super.notifyObservers(b);
	}

}

class OCBox extends Canvas implements Observer {
	Observable notifier;
	int x, y; // Locations in grid
	Color cColor = newColor();
	static final Color[] colors = { Color.black, Color.blue, Color.cyan,
			Color.darkGray, Color.gray, Color.green, Color.lightGray,
			Color.magenta, Color.orange, Color.pink, Color.red, Color.white,
			Color.yellow };

	static final Color newColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	OCBox(int x, int y, Observable notifier) {
		this.x = x;
		this.y = y;
		notifier.addObserver(this);
		this.notifier = notifier;
		addMouseListener(new ML());
	}

	public void paint(Graphics g) {
		g.setColor(cColor);
		Dimension s = getSize();
		g.fillRect(0, 0, s.width, s.height);
	}

	class ML extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			notifier.notifyObservers(OCBox.this);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		OCBox clicked = (OCBox) arg;
		if (nextTo(clicked)) {
			cColor = clicked.cColor;
			repaint();
		}
	}

	private final boolean nextTo(OCBox b) {
		return Math.abs(x - b.x) <= 1 && Math.abs(y - b.y) <= 1;
	}
}
