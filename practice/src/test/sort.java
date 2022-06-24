package test;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before sort :");
		int[]  arr = {44,34,56,-98,0,-7,13,14};
        for(int i = 0;i < arr.length;i ++) {
        	System.out.print(arr[i]+" ");
        	
        }
        
        for (int i = 1;i < arr.length;i++) {
           for(int j = 0;j < arr.length - i;j ++) {
        	   if (arr[j] > arr[j + 1]) {
        		   int t = arr[j];
        		   arr[j] = arr[j + 1];
        		   arr[j + 1] = t;
        	   }
           }
	    }
        System.out.println();
        System.out.println("after sort :");
        for(int i = 0;i < arr.length;i ++) {
        	System.out.print(arr[i]+" ");
        }
      }
}