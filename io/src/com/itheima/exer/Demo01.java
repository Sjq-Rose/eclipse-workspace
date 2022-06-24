package com.itheima.exer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UTFDataFormatException;
//编程显示一个文件内容的字节数
public class Demo01 {

	public static void main(String[] args) throws Exception {
	    //使用GBK的方式
		FileInputStream in = new FileInputStream("readergbk.txt");
		InputStreamReader isr = new InputStreamReader(in,"GBK");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream out = new FileOutputStream("writergbk.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out,"GBK");
		BufferedWriter bw = new BufferedWriter(osw);
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	    
	    //UTF-8的方式
//	    FileInputStream in1 = new FileInputStream("readergbk.txt");
//		InputStreamReader isr1 = new InputStreamReader(in1,"utf8");
//		BufferedReader br1 = new BufferedReader(isr1);
//		FileOutputStream out1 = new FileOutputStream("writergbk.txt");
//		OutputStreamWriter osw1 = new OutputStreamWriter(out1,"utf8");
//		BufferedWriter bw1 = new BufferedWriter(osw1);
//		String line1 = null;
//		while ((line1 = br1.readLine()) != null) {
//			bw1.write(line1);
//			bw1.newLine();
//		}
//		br1.close();
//		bw1.close();
//	
	}

}
