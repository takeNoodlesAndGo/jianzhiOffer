package unit6;

import org.junit.Test;

public class Solution10 {
	 public int Sum_Solution(int n) {
		 int res = 0;
		 boolean flag = (n>0)&&((res+=n+Sum_Solution(n-1))>0);
		 return res;	
	 }
	 @Test
	 public void test() {
		 int sum = Sum_Solution(10);
		 System.out.println(sum);
	 }
}
