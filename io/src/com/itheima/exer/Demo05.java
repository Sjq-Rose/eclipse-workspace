package com.itheima.exer;

import java.io.File;
import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
        //遍历特定文件*java
		File file = new File("D:\\source-Java\\code\\eclipse-workspace\\io");
		fileDir(file);
	}		
	public static void fileDir(File file) {
		File[] listFiles = file.listFiles();
		for (File files: listFiles) {
			if (files.isDirectory()) {
				String[] fileName = files.list(
						                  (dir,name)-> name.endsWith(".java"));
				fileDir(files);
				Arrays.stream(fileName)
                      .forEach(f-> System.out.println(f));
			}
		}
	}

}
