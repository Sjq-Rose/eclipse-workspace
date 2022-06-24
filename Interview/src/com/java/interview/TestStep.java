package com.java.interview;

import java.security.PublicKey;

import org.junit.Test;

//实现f（n）：求n步台阶，一共有多少种走法（考察递归与迭代）
public class TestStep {
    @Test
	public void test() throws IllegalAccessException {
	    System.out.println(f(4));
    }
	
	public  int f(int n) throws IllegalAccessException {
//        	if (n < 1) {
//				throw new IllegalAccessException(n + "不能小于1");
//			}
        	if (n ==1 || n == 2) {
        		return n;
			}
        	return f(n - 2)+ f(n - 1);
        }
	}


