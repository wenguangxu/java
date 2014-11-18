package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * C/S 模式中的Client 端应用程序。这是一个Client 端的流式Socket 通信的简单实例，代码说明Client
 * 端程序的编写方法。例中，Client 程序向服务器主机的端口4441 提出请求，连接建立后完成对服务器的读写。
 * 
 * @author Administrator
 * 
 */
public class Test3 {
	public static void main(String args[]) {
		String s = null;
		Socket mySocket;
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			mySocket = new Socket("www.baidu.com", 4441);
			in = new DataInputStream(mySocket.getInputStream());
			out = new DataOutputStream(mySocket.getOutputStream());
			out.writeUTF("good server!");
			while (true) {
				s = in.readUTF();
				if (s == null)
					break;
				else
					System.out.println(s);
			}
			mySocket.close();
		} catch (IOException e) {
			System.out.println("can’t connect");
		}
	}
}
