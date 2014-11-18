package base.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		//dateToStr();
		testCalendar();
	}

	/**
	 * Date转String
	 */
	public static void dateToStr(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String strdate = sdf.format(date);
		System.out.println(strdate);
	}
	
	/**
	 * 使用Calendar获取年、月、日
	 */
	public static void testCalendar(){
		Calendar c = Calendar.getInstance();//获取当前日期
		Date date = new Date();
		c.setTime(date);//设置时间
		int year = c.get(Calendar.YEAR);//获取年
		int month = c.get(Calendar.MONTH);//月
		int day = c.get(Calendar.DATE);//日
		System.out.println(month);
	}

}
