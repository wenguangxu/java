package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;



public class GetAddressInfo {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("localhost");
			//InetAddress addr = InetAddress.getByName("www.baidu.com");
			
			System.out.println("InetAddress | " + addr);
			
			String domainName = addr.getHostName();// 获得主机名
			String IPName = addr.getHostAddress();// 获得IP 地址
			System.out.println("hostName | " + domainName);
			System.out.println("hostAddress | " + IPName);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
