package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//�ļ� �Ļ�������---->1837ms���ǳ�����������ʹ�ã�
public class IOCompara1 {

	public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("source/src.jpg");
        FileOutputStream out = new FileOutputStream("target/dest.jpg");
        
        int len = 0;
        long beginTime = System.currentTimeMillis();
        while ((len = in.read())!= -1) {
			out.write(len);
			
		}
	    long endTime = System.currentTimeMillis();
	    System.out.println("����ʱ��Ϊ��"+(endTime-beginTime) + " ����");
	   
	    in.close();
	    out.close();
	}

}
