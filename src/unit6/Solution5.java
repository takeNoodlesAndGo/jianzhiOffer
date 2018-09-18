package unit6;

import java.util.ArrayList;

public class Solution5 {
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		 ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		 int small = 1;
		 int big = 2;
		 int s = small+big;
		 while(small<(1+sum)/2) {
			 if(s==sum) {
				 int tempSmall = small;
				 ArrayList<Integer> temp = new ArrayList<Integer>();
				 while(tempSmall<=big) {
					 temp.add(tempSmall++);
				 }
				 if(temp.size()>=2)
					 list.add(temp);
			 }
			 if(s<sum) {
				 big++;
				 s +=big;
			 }else {
				 s -=small;
				 small++;
			 }
			 
		 }
		 return list;
	 }
}
