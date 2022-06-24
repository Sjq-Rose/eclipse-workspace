package shijiaqi.entity;
public class Demo04 {
    public static int getSum(int n) {
		if(n == 1) {
			return 1;
		}
	    int t = getSum(n - 1);
	    return t + n;
    }
	public static void main(String[] args) {
		int sum = getSum(10);
		System.out.println(sum);
	}

}
