package base;

import java.util.StringTokenizer;

public class Array {
	/*
	 * 一维数组
	 */
	// 声明
	int[] arrayA;
	int arrayB[];

	public void create() {
		// 创建
		arrayA = new int[5];
		// 声明并创建
		int arrayC[] = { 1, 2, 3, 4, 5 };
		// 数组的个数
		System.out.println(arrayC.length);
		// 数组 的引用
		System.out.println(arrayC[3]);
	}

	/*
	 * 二维数组
	 */
	// 声明二维数组
	int A[][];
	int[][] B;
	int[] c[];
	// 创建二维数组
	// (1)、直接分配(平衡二维数组――矩阵)
	int a[][] = new int[4][3];
	// (2)、从最高维开始，分别对每一维分配不等长的空间（非平衡数组）
	static int b[][] = new int[4][];

	public static void create2() {
		b[0] = new int[1];
		b[0][0] = 8;
		b[1] = new int[2];
		b[2] = new int[3];
		b[3] = new int[4];
		System.out.println(b[0][0]);
	}

	public static void main(String[] args) {
		// create2();
		// showStringToKenizer();
		int[] a = { 6, 5, 4, 7, 8, 1, 2, 3, 9 };
		printArray(a);
		selectSort(a);
		//bubbleSort(a);
		//printArray(a);
		//System.out.println(search(a, 5));
		testArrayCopy();
	}

	// 直接赋值创建
	int d[][] = { { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };

	// 引用二维数组
	public void getArray2() {
		System.out.println(d[1][1]);
	}

	// 注意点:二维数组名.length表示子数组个数；二维数组名[下标1].length表示指定子数组的元素个数
	public void notice() {
		System.out.println(d.length);// 子数组的个数
		System.out.println(d[0].length);// 指定子数组元素个数
	}

	// StringTokenizer的用法
	static String hh = "i want study english";

	public static void showStringToKenizer() {
		StringTokenizer stk = new StringTokenizer(hh);
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

	/**
	 * 遍历数组
	 */
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * 一般选择排序
	 */
	public static void selectSort(int[] a) {
		for(int i = 0;i<a.length;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	/**
	 * 优化选择排序
	 */
	public static void selectSort2(int[] a) {
		int k, temp;
		for (int i = 0; i < a.length; i++) {
			k = i;
			for (int j = k + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}

			if (k != i) {
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}

	/**
	 * 冒泡排序（Bubble Sort）
	 */
	public static void bubbleSort(int[] a) {
		for(int i=0;i<a.length - 1;i++){
			for(int j = 0; j<a.length-1-i ; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 搜索算法(二分法)
	 * @param a
	 * @param b
	 */
	public static int search(int []a,int b){
		if(a.length == 0) return -1;
		int startPos = 0;
		int endPos = a.length-1;
		int m = (startPos + endPos)/2;
		while(startPos <= endPos){
			if(b == a[m]){
				return m;
			}
			if(b > a[m]){
				startPos = m+1;
			}
			if(b < a[m]){
				endPos = m-1;
			}
			m = (startPos + endPos)/2;
		}
		return -1;
	}

	public static void testArrayCopy(){
		int a[] = {1,2,3,4,5};
		int b[] = new int[6];
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int i=0;i<b.length;i++){
			System.out.print(b[i] + " ");
		}
		
		System.out.println("");
		
		int c[][] = {{1,2},{3,4,5},{6,7}};
		int d[][] = new int [3][];
		System.arraycopy(c, 0, d, 0, c.length);
		for(int i=0;i<d.length;i++){
			for(int j = 0;j<d[i].length;j++){
				System.out.print(d[i][j] +" ");
			}
			System.out.println("");
		}
	}
}
