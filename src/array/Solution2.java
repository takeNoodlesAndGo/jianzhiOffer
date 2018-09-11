package array;

public class Solution2 {\
	//求斐波那契数列可以有两种方法，一种递归，一种用数组保存大小
	  public int Fibonacci(int n) {
           if(n==0||n==1) {
        	   return n;
           }
           int[] arr = new int[n+1];
           arr[0] = 0;
           arr[1] = 1;
           for(int i =2;i<=n;i++) {
        	   arr[i] = arr[i-1]+arr[i-2];
           }
           return arr[n];
	  }
}
