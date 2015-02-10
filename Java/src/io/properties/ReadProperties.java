package io.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author wenguang.xu
 *
 */
public class ReadProperties {

	public static void main(String[] args) {
		InputStream inputStream = Object.class.getResourceAsStream("/log4j.properties");
		//InputStream inputStream2 = ReadProperties.class.getResourceAsStream("/ipConfig.properties");
		//InputStream inputStream3 = ReadProperties.class.getClassLoader().getResourceAsStream("ipConfig.properties");
		Properties p = new Properties();
		try {
			p.load(inputStream);
			inputStream.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("log4j.rootCategory :" + p.getProperty("log4j.rootCategory"));
	}
}
