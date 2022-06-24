package com.itheima;

import java.util.stream.Stream;

/**
 * 验证串行流与并行流处理同一件事花费时间的不同
 * @author 1
 *
 */
public class MyStream {

	public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        Stream<String> str1 = Stream.of(" 石佳琪"," 孙美玉"," 祁欣"," 任泉诤");
        str1.forEach(System.out::println);
        Long endTime = System.currentTimeMillis();
        System.out.println("串行流花费时间为："+( endTime-startTime));
        System.out.println("==============================================");	
        Long startTime2 = System.currentTimeMillis();
        Stream<String> str2 = Stream.of(" 石佳琪"," 孙美玉"," 祁欣"," 任泉诤");
        Stream<String> str3 = str2.parallel();
        str3.forEach(System.out::println);
        Long endTime2 = System.currentTimeMillis();
        System.out.println("并行流花费时间为："+( endTime2-startTime2));
	}  

}
