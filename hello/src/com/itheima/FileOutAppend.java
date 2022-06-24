package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 写文件时重写与增写的区别
 * @author 1
 *
 */
public class FileOutAppend {

	public static void main(String[] args) throws Exception {
      //增写文件
		FileOutputStream out = new FileOutputStream("out.txt",true);
        String str = " world";
        out.write(str.getBytes());
        out.close();
      
        //重写文件  
        FileOutputStream out2 = new FileOutputStream("out.txt");
        String str2 = "world ";
        out2.write(str2.getBytes());
        out2.close();
      
	}

}
