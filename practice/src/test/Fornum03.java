package test;

public class Fornum03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int[] c = { 89, 78, 85, 67, 92, 74, 99, 81 };
		double average = 0;
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
			sum += c[i];
		}
		System.out.println();
		average = sum / c.length;
		System.out.println();
		System.out.println(String.format("%.3f", average));

	}

}
