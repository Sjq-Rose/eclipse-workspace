package test;
/*
 * ��ӡ�����ǣ�
 */
public class Fortest07 {

	public static void main(String[] args) {
        for(int i = 9; i >= 1;i --) {
        	for(int j = 1 ; j <= i;j ++) {
        		if (j*i < 10) {
        			System.out.print(i+"*"+j+"="+j*i +"  ");
        		}else {
        			System.out.print(i+"*"+j+"="+j*i + " ");
        		}
        	}
                    System.out.println();
        }
	}

}
/**
 *��ӡ�������Σ�
 * @author 1
 *
 */

//	//	for(int i = 1;i < 10 ;i ++) {
//			for (int j = 1; j <= i; j++) {
//				if(i*j < 10) {
//				    System.out.print(j+"*"+i+"="+ j*i+ "  ");			
//				}else {
//					System.out.print(j+"*"+i+"="+j*i+ " ");
//				}
//		    }
//		            System.out.println();
//		
//	


