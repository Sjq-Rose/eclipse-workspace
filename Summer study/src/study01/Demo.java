package study01;

public class Demo {
	public static int getFact(int t) {
		if (t == 1) {
			return 1;
		}
		int temp = getFact(t - 1);
		return temp * t;

	}

	public static void main(String[] args) {
		int t = 4;

		System.out.println(getFact(t));

	}

}
