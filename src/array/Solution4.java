package array;

public class Solution4 {
	//求连续子数组的最大和
	//解法1：直观的思想是遍历求和，时间复杂度为o(n2)
	//解法2:子数组的最大值是包含各个部分的大于0的值
	//因此如果该部分大于0，则是需要包含的，如果和小于0，则需要抛弃
	 public int FindGreatestSumOfSubArray(int[] array) {
		 if(array==null||array.length==0)
			 return 0;
		 int max = Integer.MIN_VALUE;
		 int sum = 0;
		 for(int i =0;i<array.length;i++) {
			if(sum<0) {
				sum = array[i];
			}else {
				sum += array[i];
			}
			if(sum>max) {
				max = sum;
			}
		 }
		 return max;
	 }
}
