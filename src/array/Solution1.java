package array;

public class Solution1 {
	//ǰ��һ������Ϊ�Ǽ��򡣺���һ������Ϊ�Ǽ��򣬲��Һ�����������ֵС��ǰ������飬�ҳ���С��ֵ
	//������������������뵽�ö��ַ�ȷ����С������Сֵһ���ڵڶ����ֵ�����ĵ�һ��
	 public int minNumberInRotateArray(int [] array) {
		if(array==null||array.length==0) {
			return 0;
		}
		int begin = 0 ;
		int end = array.length-1;
		int mid = 0;
		while(array[begin]>=array[end]) {
			if(end-begin==1) {
				mid = end;
				break;
			}
			mid = (begin+end)/2;
			if(array[mid]==array[begin]&&array[begin]==array[mid]) {//������ͬ�����޷��ж���������һ���֣�ֻ�ܱ���
				return findMin(array,begin,end);
			}
			if(array[begin]<=array[mid]) {//���1<2,��ô12�����ڵ�һ���֣����1=2����ô3�϶���С��1��2���������ڵ�һ���֣�����begin=mid
				begin = mid;
			}else if (array[mid]<=array[end]) {//ͬ������mid
				end = mid;
			}
		}
		return array[mid];
	 }

	private int findMin(int[] array, int begin, int end) {
		// TODO Auto-generated method stub
		int min= Integer.MAX_VALUE;
		for(int i = begin;i<=end;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
