package complex;

public class Solution4 {
	//���ù鲢�����˼����м��㣬ʱ�临�Ӷ�ΪO(nlogn)
	//ÿ��mergeʱ���������
	private final static int P = 1000000007;
	public static int sum = 0;
	public int InversePairs(int [] array) {
		if(array==null||array.length<=1)
			return 0;
		int[] temp = new int[array.length];
		mergeSort(array,temp,0,array.length-1);
		return sum;
	}

	private void mergeSort(int[] array, int[] temp, int begin, int end) {
		// TODO Auto-generated method stub
		if(end<=begin)
			return ;
		int mid = (begin+end)/2;
		mergeSort(array, temp, begin, mid);
		mergeSort(array, temp, mid+1, end);
		merge(array,temp,begin,end);
	}

	private void merge(int[] array, int[] temp, int begin, int end) {
		// TODO Auto-generated method stub
		int mid = (begin+end)/2;
		int i = begin;
		int j = mid+1;
		int index = begin;
		while(i<=mid&&j<=end) {
			if(array[i]<array[j]) {
				temp[index++] = array[i++];
			}else {
				sum +=(mid+1-i);
				if(sum>=P)
					sum -=P;
				temp[index++] = array[j++];
			}
		}
		while(i<=mid) {
			temp[index++] = array[i++];
		}
		while(j<=end) {
			temp[index++] = array[j++];
		}
		while(begin<=end) {
			array[begin] = temp[begin];
			begin++;
		}
	}
}
