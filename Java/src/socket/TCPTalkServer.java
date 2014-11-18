package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPTalkServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("client:" + br.readLine());
		line = br2.readLine();
		while(!line.equals("bye")){
			pw.println(line);
			pw.flush();
			System.out.println("Server:" + line);
			System.out.println("input:" + br.readLine());
			line = br2.readLine();
		}
		br.close();
		pw.close();
		br2.close();
		s.close();
		ss.close();
	}
}
