package hello;

public class Sort {
	public static void main(Demo02[] args) {
		System.out.println(" ");
		int[] arr = { 89, 78, 85, 67, 92, 74 };
		for (int i = 0; i < arr.length; i++) {
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i ; j++) {
				if (arr[j] < arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
