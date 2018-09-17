package unit6;

import java.util.ArrayList;

import org.junit.Test;

public class Solution3 {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        int num = 0;
	        for(int a: array) {
	        	num ^= a;
	        }
	        int value = 1 ;
	        while((num^value)!=0) {
	        	value = value<<1; 
	        }
	        ArrayList<Integer> list1 = new ArrayList<Integer>();
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        for(int i =0;i<array.length;i++) {
	        	if((array[i]&value)==value)
	        		list1.add(array[i]);
	        	else
	        		list2.add(array[i]);
	        }
	        num1[0] = 0;
	        num2[0] = 0;
	        for(int i =0;i<list1.size();i++) {
	        	num1[0] ^= list1.get(i);
	        }
	        for(int i =0;i<list2.size();i++) {
	        	num2[0] ^=list2.get(i);
	        }   
	 }
	 @Test
	 public void test() {
		 int[] array = {4,6};
		 int[] num1 = new int[1];
		 int[] num2 = new int[1];
		 FindNumsAppearOnce(array, num1, num2);
		 System.out.println(num1[0]);
		 System.out.println(num2[0]);
	 }
}
