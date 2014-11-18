package socket;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.org.apache.xerces.internal.util.URI.MalformedURIException;
/**
 * 以数据流方法读取网页内容的应用程序。程序运行时，网址从文本框中读取。
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String args[]) {
		new DownNetFile();
	}
}

class DownNetFile extends JFrame implements ActionListener {
	JTextField infield = new JTextField(30);
	JTextArea showArea = new JTextArea();
	JButton b = new JButton("download");
	JPanel p = new JPanel();

	DownNetFile() {
		super("read network text file application");
		Container con = this.getContentPane();
		p.add(infield);
		p.add(b);
		JScrollPane jsp = new JScrollPane(showArea);
		b.addActionListener(this);
		con.add(p, "North");
		con.add(jsp, "Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		readByURL(infield.getText());
	}

	public void readByURL(String urlName) {
		try {
			URL url = new URL(urlName);// 由网址创建URL 对象
			URLConnection tc = url.openConnection();// 获得URLConnection 对象
			tc.connect();// 设置网络连接
			InputStreamReader in = new InputStreamReader(tc.getInputStream());
			BufferedReader dis = new BufferedReader(in);// 采用缓冲式输入
			String inline;
			while ((inline = dis.readLine()) != null) {
				showArea.append(inline + "\n");
			}
			dis.close();// 网上资源使用结束后，数据流及时关闭
		} catch (MalformedURIException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/* 访问网上资源可能产生MalformedURLException 和IOException 异常 */
	}
}
