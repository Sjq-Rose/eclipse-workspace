package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	ArrayList<Person> a1 = new ArrayList<>();
	while(true) {
		System.out.println("1.国风 2.摄影 3.音乐 4.查询个人爱好 5.退出");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("个人爱好:国风添加成功");   
		    break;
		case 2:
			System.out.println("个人爱好:摄影添加成功");
		case 3:
			System.out.println("个人爱好:音乐添加成功");
		case 4:
			System.out.println("个人爱好清单：");
		case 5:
			System.out.println("谢谢使用，拜拜！！");
			System.exit(0);
        default:
        	System.out.println("你的输入有误，请重新输入！");
		}  	break;
	}
}
private static void studentManage(ArrayList<Person>stuList,Scanner sc) {
	
}

} 
