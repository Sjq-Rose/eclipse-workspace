package study01;

import java.util.Iterator;

/**
 * 一个数如果恰好等于它的因子之和，则为完数，列如：6=1+2+3；
 * 求1000以内的完数，（因子：除去这个数本身的其他约数）
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
		//重置sum
			sum = 0;
        }
	}

}
