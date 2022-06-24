package com.itheima.exer;

/**
 * ʹ�ö�ά�����ӡһ��10�е�������ǡ�
 *  [��ʾ] 1.��һ����1��Ԫ�أ���n����n��Ԫ��
 *   2.ÿһ�е���βԪ�ؾ�Ϊ1 
 *   3.�ӵ����п�ʼ�����ڷ���βԪ���У�
 *   yangHui[i][j] = yangHui[i - 1][j-1] + yangHui[i-1][j];
 * 
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		// 1.��ά����Ĵ������ʼ��
		int[][] yangHui = new int[10][];
		// 2.������Ԫ�ظ�ֵ
		for (int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
			// 2.1 ��ÿ�е���β��ֵ
			yangHui[i][0] = yangHui[i][i] = 1;
			// 2.2��ÿ�еķ���β��ֵ
			if (i > 1) {
				for (int j = 1; j < yangHui[i].length - 1; j++) {
					yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
				}

			}
		}
		// ������ά����

		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
			}
		        System.out.println();
		}
	}
}
