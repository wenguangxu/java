package socket;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) throws Exception{
		byte[] buf = new byte[1024];
		DatagramPacket pac = new DatagramPacket(buf,buf.length);
		DatagramSocket ds = new DatagramSocket(6666);
		while(true){
			ds.receive(pac);
			ByteArrayInputStream bis = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bis);
			long num = dis.readLong();
			System.out.println(num);
		}
	}
}
