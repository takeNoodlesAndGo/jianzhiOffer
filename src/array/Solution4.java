package array;

public class Solution4 {
	//�����������������
	//�ⷨ1��ֱ�۵�˼���Ǳ�����ͣ�ʱ�临�Ӷ�Ϊo(n2)
	//�ⷨ2:����������ֵ�ǰ����������ֵĴ���0��ֵ
	//�������ò��ִ���0��������Ҫ�����ģ������С��0������Ҫ����
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
