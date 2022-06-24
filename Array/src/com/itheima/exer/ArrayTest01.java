package com.itheima.exer;

/**
 * 使用二维数组打印一个10行的杨辉三角。
 *  [提示] 1.第一行有1个元素，第n行有n个元素
 *   2.每一行的首尾元素均为1 
 *   3.从第三行开始，对于非首尾元素有：
 *   yangHui[i][j] = yangHui[i - 1][j-1] + yangHui[i-1][j];
 * 
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		// 1.二维数组的创建与初始化
		int[][] yangHui = new int[10][];
		// 2.给数组元素赋值
		for (int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
			// 2.1 给每行的首尾赋值
			yangHui[i][0] = yangHui[i][i] = 1;
			// 2.2给每行的非首尾赋值
			if (i > 1) {
				for (int j = 1; j < yangHui[i].length - 1; j++) {
					yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
				}

			}
		}
		// 遍历二维数组

		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
			}
		        System.out.println();
		}
	}
}
