package com.itheima;

import java.util.stream.Stream;

/**
 * ��֤�������벢��������ͬһ���»���ʱ��Ĳ�ͬ
 * @author 1
 *
 */
public class MyStream {

	public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        Stream<String> str1 = Stream.of(" ʯ����"," ������"," ����"," ��Ȫں");
        str1.forEach(System.out::println);
        Long endTime = System.currentTimeMillis();
        System.out.println("����������ʱ��Ϊ��"+( endTime-startTime));
        System.out.println("==============================================");	
        Long startTime2 = System.currentTimeMillis();
        Stream<String> str2 = Stream.of(" ʯ����"," ������"," ����"," ��Ȫں");
        Stream<String> str3 = str2.parallel();
        str3.forEach(System.out::println);
        Long endTime2 = System.currentTimeMillis();
        System.out.println("����������ʱ��Ϊ��"+( endTime2-startTime2));
	}  

}
