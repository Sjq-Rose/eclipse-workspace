package com.java.interview;

import java.security.PublicKey;

import org.junit.Test;

//ʵ��f��n������n��̨�ף�һ���ж������߷�������ݹ��������
public class TestStep {
    @Test
	public void test() throws IllegalAccessException {
	    System.out.println(f(4));
    }
	
	public  int f(int n) throws IllegalAccessException {
//        	if (n < 1) {
//				throw new IllegalAccessException(n + "����С��1");
//			}
        	if (n ==1 || n == 2) {
        		return n;
			}
        	return f(n - 2)+ f(n - 1);
        }
	}


