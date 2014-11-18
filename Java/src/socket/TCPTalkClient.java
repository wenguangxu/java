package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPTalkClient {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1",6666);
		BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = bf2.readLine();
		while(!line.equals("bye")){
			pw.println(line);
			pw.flush();
			System.out.println("client:" + line);
			System.out.println("server:" + bf.readLine());
			line = bf2.readLine();
		}
		bf.close();
		pw.close();
		bf2.close();
		s.close();
	}
}
