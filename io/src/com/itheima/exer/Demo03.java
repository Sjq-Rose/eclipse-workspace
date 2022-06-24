package com.itheima.exer;

import java.io.File;

public class Demo03 {

	public static void main(String[] args) {
        //验证文件换行时会自动增加2个操作符\n\r
		File file = new File("exer.txt");
		System.out.println(file.length());
	}

}
