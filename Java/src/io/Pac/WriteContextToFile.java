package io.Pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * 写文件到file2
 * @author Administrator
 *
 */
class MWindow extends JFrame implements ActionListener {
	JTextArea text;
	JButton button1;
	FileWriter writefile;
	BufferedWriter out;

	MWindow() {
		super("缓冲式样流的输出");
		Container con = this.getContentPane();// 获得内容面板
		con.setLayout(new BorderLayout());
		button1 = new JButton("写文件");
		button1.addActionListener(this);
		text = new JTextArea(20, 30);
		text.setBackground(Color.cyan);
		JScrollPane jsp = new JScrollPane(text);
		con.add(jsp, BorderLayout.CENTER);
		con.setSize(40, 40); 
		con.add(text, "Center");
		con.add(button1, "South");
		this.setVisible(true);
		this.pack();
		try {
			writefile = new FileWriter("src/io/files/file2.txt");
			out = new BufferedWriter(writefile);
		} catch (IOException e) {
		}
	}

	public void actionPerformed(ActionEvent e) {
		String s;
		if (e.getSource() == button1){
			try {
				out.write(text.getText(), 0, (text.getText()).length());
				out.flush();
				text.setText(null);
				System.exit(0);
			} catch (IOException exp) {
				text.setText("文件写出错!\n");
				System.exit(-1);
			}
		}
	}
}

public class WriteContextToFile {
	public static void main(String args[]) {
		MWindow myWin = new MWindow();
		myWin.pack();
	}
}
