package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 与例10.3 Client 端应用程序对应的Server 端应用程序。程序在4441 端口监听，当检测到有客户机请求时，
 * 产生一个内为"客户，你好，我是服务器"的字符串输出到客户端。
 * 
 * @author Administrator
 * 
 */
public class Test4 {
	public static void main(String args[]) {
		ServerSocket server = null;
		Socket you = null;
		String s = null;
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			server = new ServerSocket(4441);
		} catch (IOException e1) {
			System.out.println("ERROR:" + e1);
		}
		try {
			you = server.accept();
			in = new DataInputStream(you.getInputStream());
			out = new DataOutputStream(you.getOutputStream());
			while (true) {
				s = in.readUTF();
				if (s != null)
					break;
			}
			out.writeUTF("客户，你好，我是服务器");
			out.close();
		} catch (IOException e) {
			System.out.println("ERROR:" + e);
		}
	}
}