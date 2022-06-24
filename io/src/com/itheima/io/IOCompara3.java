package com.itheima.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//ͨ���ֽڻ�������ʵ�ֶ��ļ��Ŀ���---> 10ms/9ms/12ms(���ţ�����ʹ�ã�
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
		System.out.println("����ʱ��Ϊ:" + (endTime - beginTime) + " ����");
		
		bis.close();
		bos.close();
	}

}
