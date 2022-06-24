package test;

public class Fornum02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 89, 78, 85, 67, 92, 74, 99, 80 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int max = 0;
		int location = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				location = i;
			}
		}
		System.out.println();
		System.out.println(max);
		System.out.println(location + 1);
	}

}
