package com.itheima.date;

import java.util.Calendar;

/**
 * 从2022年3月27日计算多少天后是2022年4月17日
 * @author 1
 *
 */
public class MySubCale {

	public static void main(String[] args) {
		Calendar cale1 = Calendar.getInstance();
		cale1.set(2022, 2, 27);
		Calendar cale2 = Calendar.getInstance();
		cale2.set(2022, 3, 17);
		Long startTime = cale1.getTimeInMillis();
		Long endTime = cale2.getTimeInMillis();
		Long subDate = ( endTime - startTime)/(1000*60*60*24);
		System.out.println(subDate);

	}

}