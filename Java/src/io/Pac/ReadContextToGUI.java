package io.Pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyWindow extends JFrame implements ActionListener {
	JTextArea text;
	BufferedReader in;
	JButton button1;
	FileReader file;

	MyWindow() {
		super("缓冲区中读取");
		Container con = this.getContentPane();// 获得内容面板
		con.setSize(100, 400);
		con.setLayout(new BorderLayout());
		button1 = new JButton("读取文件");
		button1.addActionListener(this);
		text = new JTextArea(20, 20);
		text.setBackground(Color.cyan);
		JScrollPane jsp = new JScrollPane(text);
		con.add(jsp, BorderLayout.CENTER);
		con.add(button1, "South");
		this.setVisible(true);
		this.pack();
		try {
			File f = new File("src/io/files/file2.txt");
			file = new FileReader(f);// 或者file = new
										// FileReader(“Example9_3.java”);
			in = new BufferedReader(file);
		} catch (FileNotFoundException e1) {
			text.setText("文件没有找到");
			button1.removeActionListener(this);
		}
	}

	public void actionPerformed(ActionEvent e) {
		String s;
		if (e.getSource() == button1)
			try {
				while ((s = in.readLine()) != null)
					text.append(s + '\n');
			} catch (IOException exp) {
			}
	}
}

public class ReadContextToGUI {
	public static void main(String arg[]) {
		MyWindow myWin = new MyWindow();
	}
}