package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class IO02 {

	public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("in.txt");
        int n = 0;
        while ((n = in.read() )!= -1) {
			System.out.println(n);
		}
	    in.close();
	}

}
