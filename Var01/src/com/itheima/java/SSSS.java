package com.itheima.java;

import java.util.Scanner;

//import java.security.PublicKey;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Iterator;

/**
 * ���û��Ӽ�������������������������ǵ����Լ����
��������ʽ���������������ÿո�ָ�
�������ʽ�����ǵ����Լ��
���������롿3 4
�����������1
���㷨˵������շת����������Դ���m��Ϊ��������С��n��Ϊ���������֮�������Ϊy;
���y������0����n��ֵ��m,��y��ֵ��n������������õ��µ�y��ֱ��y����0Ϊֹ��
��ʱ��n�е����������Լ����
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
