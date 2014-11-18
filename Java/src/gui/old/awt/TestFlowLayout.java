package gui.old.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestFlowLayout {
	public static void main(String[] args) {
		Frame f = new Frame("a");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));//arg2：水平间距 arg3：垂直间距
		Button b1 = new Button("ok");
		Button b2 = new Button("click");
		Button b3 = new Button("open");
		Button b4 = new Button("close");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(100,100);
		f.setVisible(true);
	}
}
