package hello;

//����Ļ�����1+2+3+4+5+6+7+8+9+10=..
public class Demo02 {

	public static void main(java.lang.String[] args) {
		String str = "123456789";
		char[] charArray = str.toCharArray();
		System.out.println("���ַ���תΪ�ַ�����ı��������");
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + "+");
		}
		int sum = 0;
		for (int i = 0; i < charArray.length + 2; i++) {
			sum += i;
		}
		System.out.print(charArray.length + 1 + "=" + sum);

	}

}
