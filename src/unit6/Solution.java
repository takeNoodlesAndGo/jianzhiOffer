package unit6;

import org.junit.Test;

public class Solution {
	public int GetNumberOfK(int [] array , int k) {
	    if(array==null||array.length==0)
	    	return 0;
	    int n = array.length;
	    int begin = 0;
	    int end = n-1;
	    int mid = 0;
	    int maxIndex = 0;
	    int minIndex = 0;
	    while(begin<=end) {
	    	mid = (begin+end)/2;
	    	if(array[mid]==k) {
	    		minIndex = mid;
	    		while(minIndex!=0) {
	    			if(array[minIndex]==array[minIndex-1])
	    				minIndex--;
	    			else 
	    				break;
	    		}
	    		maxIndex = mid;
	    		while(maxIndex!=n-1) {
	    			if(array[maxIndex]==array[maxIndex+1])
	    				maxIndex++;
	    			else
	    				break;
	    		}
	    		break;
	    	}else {
	    		if(array[mid]>k)
	    			end = mid-1;
	    		else {
	    			begin = mid+1;
	    		}
	    	}
	    }
	    if(begin>end) {
	    	return 0;
	    }
	    return maxIndex-minIndex+1;
    }
	@Test
	public void test() {
		int[] arr = {1,2,3,3,3,3,4,5};
		GetNumberOfK(arr, 3);
	}
}
