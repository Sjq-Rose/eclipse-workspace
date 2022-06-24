package com.itheima;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 以字节的形式读文件操作
 * 
 * @author 1
 *
 */
public class FileInIo {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");
		int b = 0;
		while ((b = in.read()) != -1) {
			System.out.println(b);
		}
		in.close();

	}

}
