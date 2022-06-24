package hello;

public class Ergoic{
	public static void main(Demo02[] args) {
	int sum = 0;
	for(int i = 0;i <=1000;i++) {
		if(i % 2 != 0) {
			sum += i;
		}
	}
	System.out.println(sum);
	}
}