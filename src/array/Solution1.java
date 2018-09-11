package array;

public class Solution1 {
	//前面一个数组为非减序。后面一个数组为非减序，并且后面数组的最大值小于前面的数组，找出最小的值
	//根据有序数组很容易想到用二分法确定最小数，最小值一定在第二部分的数组的第一个
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
			if(array[mid]==array[begin]&&array[begin]==array[mid]) {//三个相同，则无法判断是属于那一部分，只能遍历
				return findMin(array,begin,end);
			}
			if(array[begin]<=array[mid]) {//如果1<2,那么12都属于第一部分，如果1=2，那么3肯定是小于1和2，依旧属于第一部分，所以begin=mid
				begin = mid;
			}else if (array[mid]<=array[end]) {//同理，更新mid
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
