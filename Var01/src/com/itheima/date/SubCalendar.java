package com.itheima.date;

import java.sql.Date;
import java.text.DateFormat;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 编写一个输出两个日期型数据相差多少天的程序，并用2022.2.26与2022.1.7来计算还有多少天开学
 * 
 * @author 1
 *
 */
public class SubCalendar {

	public static void main(String[] args) {
		Calendar cale1 = Calendar.getInstance();//获取第一个Calendar 对象
		System.out.println("请输入第一个日期：");
		System.out.print("请输入年份：");
		Scanner y1 = new Scanner(System.in);
		int str1 = y1.nextInt();
		System.out.print("请输入月份：");
		Scanner m1 = new Scanner(System.in);
		int str2 = m1.nextInt();
		System.out.print("请输入天数：");
		Scanner d1 = new Scanner(System.in);
		int str3 = d1.nextInt();
		cale1.set(str1, str2, str3);//设置第一个从键盘获得的日期
		Calendar cale2 = Calendar.getInstance();//获取第二个Calendar 对象
		System.out.println("请输入第二个年份：");
		System.out.print("请输入年份：");
		Scanner y2 = new Scanner(System.in);
		int str4 = y2.nextInt();
		System.out.print("请输入月份：");
		Scanner m2 = new Scanner(System.in);
		int str5 = m2.nextInt();
		System.out.print("请输入天数：");
		Scanner d2 = new Scanner(System.in);
		int str6 = d2.nextInt();
		cale2.set(str4, str5, str6);//设置第二个从键盘获得的日期
		long time1 = cale1.getTimeInMillis();//获取两个日期的毫秒值
		long time2 = cale2.getTimeInMillis();
		long subDate = (time2 - time1) / (1000 * 60 * 60 * 24);// 用这两个相差的毫秒数除以每天的毫秒数；

		System.out.println("由计算得出还有" + subDate + "天开学！");
	}
}
