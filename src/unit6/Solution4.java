package unit6;

import java.util.ArrayList;

public class Solution4 {
	 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	     ArrayList<Integer> list = new ArrayList<Integer>(); 
		 if(array==null||array.length<=2)
			 return list;
		 int begin = 0;
		 int end = array.length-1;
		 while(begin<end) {
			 if(array[begin]+array[end]==sum) {
				 list.add(array[begin]);
				 list.add(array[end]);
				 return list;
			 }else if(array[begin]+array[end]<sum){
				 begin++;
			 }else {
				 end--;
			 }
		 }
		 return list;
	 }
}
