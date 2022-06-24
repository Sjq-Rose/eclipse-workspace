package com.itheima.exer;

import java.io.RandomAccessFile;

public class Demo07 {

	public static void main(String[] args) throws Exception {
		// 验证随机文件的读写操作
		RandomAccessFile raf = new RandomAccessFile("time.txt", "rw");
		int times = Integer.parseInt(raf.readLine()) - 1;
		if (times > 0) {
			System.out.println("文件可读次数为："+times);
			raf.seek(0);
			raf.write((times + "").getBytes());
		} else {
			System.out.println("文件不可再读");
		}
//		raf.close();
//        raf.seek(3);
//        byte a = raf.readByte();
//        System.out.println(a);
//        System.out.println((char)a);
//        raf.close();
//		
		
		
	}
}