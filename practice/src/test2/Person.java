package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	ArrayList<Person> a1 = new ArrayList<>();
	while(true) {
		System.out.println("1.���� 2.��Ӱ 3.���� 4.��ѯ���˰��� 5.�˳�");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("���˰���:������ӳɹ�");   
		    break;
		case 2:
			System.out.println("���˰���:��Ӱ��ӳɹ�");
		case 3:
			System.out.println("���˰���:������ӳɹ�");
		case 4:
			System.out.println("���˰����嵥��");
		case 5:
			System.out.println("ллʹ�ã��ݰݣ���");
			System.exit(0);
        default:
        	System.out.println("��������������������룡");
		}  	break;
	}
}
private static void studentManage(ArrayList<Person>stuList,Scanner sc) {
	
}

} 
