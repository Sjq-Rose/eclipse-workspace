package com.itheima.date;

import java.util.Random;
import java.util.Scanner;

public class MyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数组长度：");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x];
		Random r = new Random();

		for (int i = 0; i < x; i++) {
			arr[i] = (r.nextInt(99-60+1)+60);//[60-99]
     
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}

		}

	}

}
