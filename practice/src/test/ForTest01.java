package test;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*��дһ�������1ѭ����150������ÿ�д�ӡһ��ֵ��
         * ��ÿ��3�ı������ϴ�ӡ����foo����
         * 5�ı����д�ӡ��biz",
         * 7�ı����д�ӡ��baz".
         */
		for (int i = 1;i <= 150;i ++) {
			System.out.print(i + " ");
			if(i % 3 == 0) {
				System.out.print("foo "); 
			}
			if(i % 5 == 0) {
				System.out.println("biz ");
				
			}
			if(i % 7 == 0) {
			    System.out.println("baz ");
			    
		}
	            System.out.println();//����
		}
 }
}
