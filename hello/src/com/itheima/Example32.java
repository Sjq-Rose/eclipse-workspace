package com.itheima;

//�������еĵ�����һ�еķ�ʽ����Ļ���������������֮����һ���ո�翪��
//
//��������ʽ��
//�������ʽ��9 3 5 
//
//���������롿
//�����������
//������˵����
//�����ֱ�׼��

import java.util.*;
import java.util.stream.Stream;

public class Example32 {
	public static void main(String[] args) {
		Integer[] array = { 9, 8, 3, 5, 2 }; // ����һ������
		List<Integer> list = Arrays.asList(array); // ������ת��ΪList����
		// ʹ�ü��϶����stream()��̬��������Stream������
		Stream<Integer> stream = list.stream();
		stream.filter(i -> (i % 2 != 0)).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}
}
