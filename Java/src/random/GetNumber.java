package random;

/**
 * //生成7位数，每位范围1~11
 * @author wenguang.xu
 *
 */
public class GetNumber {

	public static void main(String[] args) {
		String res = getRandom(1,11,7);//生成7位数，每位范围1~11
		System.out.println(res);
	}
	
	/**
	 * 获取指定范围、指定位数的随机数
	 * @param min 最小范围
	 * @param max 最大范围
	 * @param length 生成多少个
	 * @return String
	 */
	public static String getRandom(int min,int max,int length){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			long Temp;
			Temp=Math.round(Math.random()*(max-1) + (min+1));
			sb.append(Temp).append(" ");
		}
		return sb.toString();
	}

}
