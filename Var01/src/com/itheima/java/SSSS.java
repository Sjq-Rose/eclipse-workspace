package com.itheima.java;

import java.util.Scanner;

//import java.security.PublicKey;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Iterator;

/**
 * 】用户从键盘输入两个正整数，输出它们的最大公约数。
【输入形式】两个正整数，用空格分隔
【输出形式】它们的最大公约数
【样例输入】3 4
【样例输出】1
【算法说明】“辗转相除”法：以大数m作为被除数，小数n作为除数，相除之后的余数为y;
如果y不等于0，则将n赋值给m,将y赋值给n，继续相除，得到新的y；直到y等于0为止。
此时，n中的数就是最大公约数。
 * @author
 */
public class SSSS {
	public static void main(String[] args) {
	    int m,n;
	    Scanner in = new Scanner(System.in);
	    m =in.nextInt();
	    n = in.nextInt();
	    int min = (m <= n)?m:n;
	    for(int i = min;i>=1;i--) {
	    	if(m % i==0 && n % i== 0) {
	    		System.out.println(i);
	    	}
	    }
	    
	}
}
