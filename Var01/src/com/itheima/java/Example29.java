package com.itheima.java;

import java.util.Arrays;

public class Example29 {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		//��֤Arrays�������еĿ��������Ƿ�λΪ����ҿ�
		int[] copied = Arrays.copyOfRange(arr, 1, 3);
		for (int i = 0; i < copied.length; i++) {
			System.out.print(copied[i] + " ");
		}
		//�滻Ԫ�أ�fill������
		System.out.println();
		int[] arr1 = { 1, 2, 3, 4 };
		Arrays.fill(arr1, 0);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + " :" + arr1[i]);
		}

	}

}
