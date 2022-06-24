package com.itheima.java;

import java.util.Arrays;

public class Example29 {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		//验证Arrays工具类中的拷贝方法是否定位为左闭右开
		int[] copied = Arrays.copyOfRange(arr, 1, 3);
		for (int i = 0; i < copied.length; i++) {
			System.out.print(copied[i] + " ");
		}
		//替换元素（fill）方法
		System.out.println();
		int[] arr1 = { 1, 2, 3, 4 };
		Arrays.fill(arr1, 0);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + " :" + arr1[i]);
		}

	}

}
