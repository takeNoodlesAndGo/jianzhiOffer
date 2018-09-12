package sort;

import org.junit.jupiter.api.Test;

public class Solution {
	public void quickSort(int[] arr) {
		if(arr==null||arr.length<=1) {
			return ;
		}
		quickSortM(arr,0,arr.length-1);
	}

	private void quickSortM(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end)
			return ;
		int bounary = partition(arr,start,end);
		quickSortM(arr,start,bounary-1);
		quickSortM(arr, bounary+1, end);
	}

	private int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int bounary = arr[start];
		while(start<end) {
			while(start<end&&arr[end]>=bounary) {
				end--;
			}
			arr[start] = arr[end];
			while(start<end&&arr[start]<=bounary) {
				start++;
			}
			arr[end] = arr[start];
		}
		arr[start] = bounary;
		return start;
	}
	@Test
	public void testQuickSort() {
		int[] arr = {2,3,1,4,2,0,5,-1,2,8,7};
		quickSort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
