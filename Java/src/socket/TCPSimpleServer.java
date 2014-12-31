package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端
 * @author wenguangxu
 *
 */
public class TCPSimpleServer {
	
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(6666);
		
		try {
			Socket socket = ss.accept();
			
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
				
				while(true) {
					String str = in.readLine();
					if(str.equals("END")) break;
					out.print(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ss.close();
		}
		
	}
	
}
