package com.itheima;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {

	public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("7210764330.txt");
        int t = 0;
        while((t= in.read()) != -1){
        	System.out.print((char)t);
        }
	        in.close();
	}
        
}
