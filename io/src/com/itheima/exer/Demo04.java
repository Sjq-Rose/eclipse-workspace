package com.itheima.exer;

import java.io.File;
import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		// 遍历文件的操作
		File file = new File("D:\\source前端\\code\\01-introduce");
		fileDir(file);
	}

	public static void fileDir(File file) {
		File[] listFiles = file.listFiles();
		for (File files : listFiles) {
			if (files.isDirectory()) {

				fileDir(files);
			}
			System.out.println(files);
		}
	}
}
