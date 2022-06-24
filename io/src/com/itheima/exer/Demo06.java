package com.itheima.exer;

import java.io.File;

public class Demo06 {

	public static void main(String[] args) {
		// 删除文件夹的内容
		File files = new File("D:\\Word文档\\新建文件夹");
    	deleteDir(files);
		// 验证若一个文件夹有内容，这个文件夹用delete（）方法不能删除
		//files.delete();
	}

	public static void deleteDir(File files) {
        File[] liFiles = files.listFiles();
        for (File file : liFiles) {
        	if (file.isDirectory()) {
				deleteDir(file);
			}
			file.delete();
		}
	        files.delete();
	
	}

}
