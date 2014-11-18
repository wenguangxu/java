package socket;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test5 extends Applet implements Runnable, ActionListener {
	JButton button;
	JTextField textF;
	JTextArea textA;
	Socket socket;
	Thread thread;
	DataInputStream in;
	DataOutputStream out;

	public void init() {
		setBackground(new Color(120, 153, 137));
		setLayout(new BorderLayout());
		button = new JButton("发送信息");
		textF = new JTextField(20);
		textA = new JTextArea(20, 30);
		setSize(450, 350);
		JPanel p = new JPanel();
		p.add(textF);
		p.add(button);
		add(textA, "Center");
		add(p, "South");
		button.addActionListener(this);
	}

	public void start() {
		try {
			socket = new Socket(this.getCodeBase().getHost(), 4441);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
		}
		if (thread == null) {
			thread = new Thread(this);
			thread.setPriority(Thread.MIN_PRIORITY);
			thread.start();
		}
	}

	public void run() {
		String s = null;
		while (true) {
			try {
				s = in.readUTF();
			} catch (IOException e) {
			}
			if (s.equals("结束")) {
				try {
					socket.close();
					break;
				} catch (IOException e) {
				}
			} else
				textA.append(s + "\n");
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String s = textF.getText();
			if (s != null) {
				try {
					out.writeUTF(s);
				} catch (IOException e1) {
				}
			} else {
				try {
					out.writeUTF("请说话");
				} catch (IOException e1) {
				}
			}
		}
	}
}