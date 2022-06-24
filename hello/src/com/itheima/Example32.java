package com.itheima;

//将数组中的单数以一行的方式在屏幕上输出（两个数据之间用一个空格界开）
//
//【输入形式】
//【输出形式】9 3 5 
//
//【样例输入】
//【样例输出】
//【样例说明】
//【评分标准】

import java.util.*;
import java.util.stream.Stream;

public class Example32 {
	public static void main(String[] args) {
		Integer[] array = { 9, 8, 3, 5, 2 }; // 创建一个数组
		List<Integer> list = Arrays.asList(array); // 将数组转换为List集合
		// 使用集合对象的stream()静态方法创建Stream流对象
		Stream<Integer> stream = list.stream();
		stream.filter(i -> (i % 2 != 0)).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}
}
