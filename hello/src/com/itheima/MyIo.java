package com.itheima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyIo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = br.readLine();
		for (int i = 0; i <= 4; i++) {
			if (password.equals("123456")) {
				System.out.println("Congratulations on entering the game");
				break;
			} else if (i == 4) {
//		System.out.println("Wrong password, end of game");
//		System.exit(0);
				continue;
			} else {
//		System.out.println();
//		br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Wrong password, end of game");
				System.exit(0);
			}
		}
	}

}
