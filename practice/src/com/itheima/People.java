package com.itheima;

public class People {
		// TODO Auto-generated method stub
		int height;
		String ear;
		void speak(String s) {
			System.out.println(s);
		}
		public static void main(String[] args) {
			People zhubajie;
			zhubajie = new People();
			zhubajie.height = 170;
			zhubajie.ear = "Two ears";
		System.out.println("Height:"+zhubajie.height);
		System.out.println(zhubajie.ear);
		zhubajie.speak("Master, let's not go to the West,let's go to the Moon Palace instead.");

		
	}

}
