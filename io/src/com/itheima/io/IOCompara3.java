package com.itheima.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//通过字节缓冲流来实现对文件的拷贝---> 10ms/9ms/12ms(最优，建议使用）
public class IOCompara3 {

	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source/src.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("target/dest.jpg"));
		
		int len = 0;
		long beginTime = System.currentTimeMillis();
		while ((len = bis.read()) != -1) {
			bos.write(len);

		}
		long endTime = System.currentTimeMillis();
		System.out.println("花费时间为:" + (endTime - beginTime) + " 毫秒");
		
		bis.close();
		bos.close();
	}

}
