package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io01 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("out.txt");
		String str = "hello";
		out.write(str.getBytes());
        out.close();
	}

}
