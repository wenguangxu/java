package socket;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 * TCP客户端
 * @author Administrator
 *
 */
public class TCPClient {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1",6666);
		DataOutputStream os = new DataOutputStream(s.getOutputStream());
		os.writeUTF("Hello Server !");
		os.flush();
		os.close();
		s.close();
	}
}
