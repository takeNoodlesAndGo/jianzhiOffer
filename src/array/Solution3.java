package array;

public class Solution3 {
	//change commite to 29
	 public int MoreThanHalfNum_Solution(int [] array) {
		 if(array==null||array.length==0) {
			 return 0;
		 }
		 int n = array.length;
		 int value = array[0];
		 int num = 1;
		 for(int i =1;i<n;i++) {
			 if(num==0) {
				 num=1;
				 value = array[i];
			 }else {
				 if(value!=array[i]) {
					 num--;
				 }else {
					 num++;
				 }
			 }
		 }
		 int sum = 0;
		 for(int i =0;i<n;i++) {
			 if(array[i]==value) {
				 sum++;
			 }
		 }
		 if(sum>n/2) {
			 return value;
		 }
		 return 0;
	 }
}
