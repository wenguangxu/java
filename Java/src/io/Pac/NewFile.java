package io.Pac;

import java.io.File;
import java.io.IOException;

public class NewFile {
	File file = new File("f1");
	File file2 = new File("F://common/a","file2.txt");
	
	public static void main(String[] args) {
		NewFile f = new NewFile();
		//f.test();
		//f.newFile();
		File file = new File("E:/A");
		f.readDirectory(file,1);
	}
	
	public void test(){
		System.out.println(file.getName());
		System.out.println(file2.getName());
	}
	
	/**
	 * 创建目录文件
	 */
	public void newFile(){
		String separator = File.separator;
		String fileName = "myFile.txt";
		String directory = "D:/mydir1" + separator + "mydir2";
		File f = new File(directory,fileName);
		if(f.exists()){
			System.out.println("文件名：" + f.getAbsolutePath());
			System.out.println("文件大小：" + f.length());
		}else{
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 读取某个目录下的所有文件，层次显示
	 */
	public void readDirectory(File f,int level){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level; i++) {
			sb.append("  ");
		}
		File[] childs = f.listFiles();
		for (int i = 0; i < childs.length; i++) {
			System.out.println(sb.toString() + childs[i].getName());
			if(childs[i].isDirectory()){
				readDirectory(childs[i],level+1);
			}
		}
	}
}
