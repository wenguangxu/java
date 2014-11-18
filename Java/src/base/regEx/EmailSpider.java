package base.regEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 抓取指定网页Email
 * @author Administrator
 *
 */
public class EmailSpider {
	public static void main(String[] args) {
			try {
				BufferedReader bf = new BufferedReader(new FileReader("src\\base\\regEx\\a.htm"));
				String line;
				while((line=bf.readLine())!=null){
					parse(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void parse(String line){
		Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
		Matcher m = p.matcher(line);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
