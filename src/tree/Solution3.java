package tree;

public class Solution3 {
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence==null||sequence.length==0)
			return false;
		return bst(sequence,0, sequence.length-1);
	}
	public boolean bst(int[] arr,int begin,int end) {
		if(begin>=end) {
			return true;
		}
		int i = 0;
		for(;i<end;i++) {
			if(arr[i]>arr[end]) {
				break;
			}
		}
		int j = i;
		for(;j<end;j++) {
			if(arr[j]<arr[end]) {
				return false;
			}
		}
		return bst(arr,begin,i-1)&&bst(arr,i,end-1);
	}
}
