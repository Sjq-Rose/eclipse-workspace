package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//ͨ���ֽ����Ļ��������ļ����п���--->3ms
public class IOCompara2 {

	public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("source/src.jpg");
        FileOutputStream out = new FileOutputStream("target/dest.jpg");
        
        int len = 0;
        byte[]  buff = new byte[1024];
        long beginTime = System.currentTimeMillis();
        while ((len = in.read(buff)) != -1) {
			out.write(buff, 0, len);
			
		}
	    long endTime = System.currentTimeMillis();
	    System.out.println("����ʱ��Ϊ:"+(endTime-beginTime) + " ����");
	   
	    in.close();
	    out.close();
	}

}
