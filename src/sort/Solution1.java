package sort;

import java.util.ArrayList;

public class Solution1 {
	//题目要求：为最小k个数
	//解法1：最先想到的是进行排序，然后选取前k个数，时间复杂度为O(nlogn)
	//解法2：因为要求是获得最小的k个数，并不需要知道k个数的大小顺序
    //因此可以使用快排的partition函数的思想，第k个数左边为最小的k个数，右边为比他大的数字  O(n)复杂度
	//解法3：如果数组长度很大，k很小。这种情况是海量数据处理，需要建立k个结点的最大堆。
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(input==null||input.length==0) {
			return list;
		}
		if(k>input.length||k==0) 
			return list;
		int start = 0;
		int end = input.length-1;
		int index = 0;
		while(start<=end) {
			index = partition(input, start, end);
			if(index==k-1)
				break;
			else if(index>k-1) {
				end = index-1;
			}else {
				start = index+1;
			}
		}
		for(int i =0;i<=index;i++) {
			list.add(input[i]);
		}
		return list;
	}

	private int partition(int[] input, int start, int end) {
		// TODO Auto-generated method stub
		int bound = input[start];
		while(start<end) {
			while(start<end&&input[end]>=bound) {
				end--;
			}
			input[start] = input[end];
			while(start<end&&input[start]<=bound) {
				start++;
			}
			input[end] = input[start];
		}
		input[start] = bound;
		return start;
	}
}
