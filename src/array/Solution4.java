package array;

public class Solution4 {
	//�����������������
	//�ⷨ1��ֱ�۵�˼���Ǳ�����ͣ�ʱ�临�Ӷ�Ϊo(n2)
	//�ⷨ2:����������ֵ�ǰ����������ֵĴ���0��ֵ
	//�������ò��ִ���0��������Ҫ�����ģ������С��0������Ҫ����
//	 public int FindGreatestSumOfSubArray(int[] array) {
//		 if(array==null||array.length==0)
//			 return 0;
//		 int max = Integer.MIN_VALUE;
//		 int sum = 0;
//		 for(int i =0;i<array.length;i++) {
//			if(sum<0) {
//				sum = array[i];
//			}else {
//				sum += array[i];
//			}
//			if(sum>max) {
//				max = sum;
//			}
//		 }
//		 return max;
//	 }
	//���ö�̬�滮�����
	// dp[i]Ϊ0 ~ i���������������ĺ�
	//dp[i] = max{array[i],dp[i-1]+array[i]};
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length==0) {
			return 0;
		}
		int[] dp = new int[array.length];
		dp[0] = array[0];
		for(int i =1;i<array.length;i++) {
			dp[i] = Math.max(dp[i-1]+array[i], array[i]);
		}
		int max = Integer.MIN_VALUE;
		for(int i =0;i<array.length;i++) {
			if(max<dp[i]) {
				max = dp[i];
			}
		}
		return max;
	}
}
