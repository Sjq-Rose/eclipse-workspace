package com.itheima.date;

import java.sql.Date;
import java.text.DateFormat;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/**
 * ��дһ���������������������������ĳ��򣬲���2022.2.26��2022.1.7�����㻹�ж����쿪ѧ
 * 
 * @author 1
 *
 */
public class SubCalendar {

	public static void main(String[] args) {
		Calendar cale1 = Calendar.getInstance();//��ȡ��һ��Calendar ����
		System.out.println("�������һ�����ڣ�");
		System.out.print("��������ݣ�");
		Scanner y1 = new Scanner(System.in);
		int str1 = y1.nextInt();
		System.out.print("�������·ݣ�");
		Scanner m1 = new Scanner(System.in);
		int str2 = m1.nextInt();
		System.out.print("������������");
		Scanner d1 = new Scanner(System.in);
		int str3 = d1.nextInt();
		cale1.set(str1, str2, str3);//���õ�һ���Ӽ��̻�õ�����
		Calendar cale2 = Calendar.getInstance();//��ȡ�ڶ���Calendar ����
		System.out.println("������ڶ�����ݣ�");
		System.out.print("��������ݣ�");
		Scanner y2 = new Scanner(System.in);
		int str4 = y2.nextInt();
		System.out.print("�������·ݣ�");
		Scanner m2 = new Scanner(System.in);
		int str5 = m2.nextInt();
		System.out.print("������������");
		Scanner d2 = new Scanner(System.in);
		int str6 = d2.nextInt();
		cale2.set(str4, str5, str6);//���õڶ����Ӽ��̻�õ�����
		long time1 = cale1.getTimeInMillis();//��ȡ�������ڵĺ���ֵ
		long time2 = cale2.getTimeInMillis();
		long subDate = (time2 - time1) / (1000 * 60 * 60 * 24);// �����������ĺ���������ÿ��ĺ�������

		System.out.println("�ɼ���ó�����" + subDate + "�쿪ѧ��");
	}
}
