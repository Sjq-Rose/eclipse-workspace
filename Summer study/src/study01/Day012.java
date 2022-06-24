package study01;
/**
 *  ******
 *  *****
 *  **** 
 *  ***
 *  **
 *  *
 * @author 1
 * 外层循环控制行数，内层循环控制列数
 */
public class Day012 {

	public static void main(String[] args) {
        for(int i = 1; i <= 6;i++) {
        	for(int j = 1; j <= 7 - i;j++) {
        		System.out.print("*");
        	}
               System.out.println();
        }
	}

}
