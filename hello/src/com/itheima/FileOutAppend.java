package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * д�ļ�ʱ��д����д������
 * @author 1
 *
 */
public class FileOutAppend {

	public static void main(String[] args) throws Exception {
      //��д�ļ�
		FileOutputStream out = new FileOutputStream("out.txt",true);
        String str = " world";
        out.write(str.getBytes());
        out.close();
      
        //��д�ļ�  
        FileOutputStream out2 = new FileOutputStream("out.txt");
        String str2 = "world ";
        out2.write(str2.getBytes());
        out2.close();
      
	}

}
