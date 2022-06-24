package com.itheima.io;

import java.io.*;
public class IO01 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(in, "utf8");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream out = new FileOutputStream("writer.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "utf8");
		BufferedWriter bw = new BufferedWriter(osw);
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();//±Ì æªª––
		}
		br.close();
		bw.close();

	}
}
