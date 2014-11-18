package socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端
 * @author Administrator
 *
 */
public class TCPServer {
	
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(6666);
		while(true){
			Socket s = ss.accept();
			System.out.println("a client connect !");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
		}
	}
	
}
