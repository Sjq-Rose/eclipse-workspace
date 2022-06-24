package test;

public class Fornum04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int[] a = { 89, 78, 85, 67, 92, 74 };
		for (int i = 0; i < a.length; i++) {
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] < a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
