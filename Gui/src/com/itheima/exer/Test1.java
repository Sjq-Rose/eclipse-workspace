package com.itheima.exer;
import java.io.*;
public class Test1 {

	public static void main(String[] args) throws Exception {
        int a = 8;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("������һ������");
        String input = br.readLine();
        int b = Integer.parseInt(input);
        if(b > a) {
        	int sum = b/a;
        	System.out.println(sum);
        	
        }else {
			System.out.println("�������");
		}
	}

}
