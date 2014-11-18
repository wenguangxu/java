package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * 说明Inetaddress类的用法的应用程序。程序演示如何获取www.fudan.edu.cn地址。
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.baidu.com");
			String domainName = addr.getHostName();//获得主机名
			String IPName = addr.getHostAddress();//获得IP 地址
			System.out.println(domainName);
			System.out.println(IPName);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}
