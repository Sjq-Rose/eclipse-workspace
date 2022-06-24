package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//文件 的基础拷贝---->1837ms（非常慢，不建议使用）
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
	    System.out.println("花费时间为："+(endTime-beginTime) + " 毫秒");
	   
	    in.close();
	    out.close();
	}

}
