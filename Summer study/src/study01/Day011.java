package study01;

import java.util.Iterator;

/**
 * һ�������ǡ�õ�����������֮�ͣ���Ϊ���������磺6=1+2+3��
 * ��1000���ڵ������������ӣ���ȥ��������������Լ����
 * @author 1
 *
 */
public class Day011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
        	for(int j = 1; j < i;j++) {
        		if (i % j == 0) {
        			sum += j;
				}
        	}
			if (i == sum) {
				System.out.println(i);
				
			}
		//����sum
			sum = 0;
        }
	}

}
