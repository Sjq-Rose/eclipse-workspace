package com.itheima.exer;

import java.io.RandomAccessFile;

public class Demo07 {

	public static void main(String[] args) throws Exception {
		// ��֤����ļ��Ķ�д����
		RandomAccessFile raf = new RandomAccessFile("time.txt", "rw");
		int times = Integer.parseInt(raf.readLine()) - 1;
		if (times > 0) {
			System.out.println("�ļ��ɶ�����Ϊ��"+times);
			raf.seek(0);
			raf.write((times + "").getBytes());
		} else {
			System.out.println("�ļ������ٶ�");
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