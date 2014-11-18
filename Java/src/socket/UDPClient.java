package socket;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception{
		long num = 1000L;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeLong(num);
		byte[] buf = os.toByteArray();
		DatagramPacket dp = new DatagramPacket(buf, buf.length,new InetSocketAddress("127.0.0.1",6666));
		DatagramSocket ds = new DatagramSocket(5555);
		ds.send(dp);
		ds.close();
	}
}
