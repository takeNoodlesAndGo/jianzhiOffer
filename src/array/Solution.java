package array;

public class Solution {
	//��ά����Ĳ��ң���ά����������ң����ϵ���Ϊ��������
	 public boolean Find(int target, int [][] array) {
		 if(array==null)
			 return false;
		 int len = array[0].length;
		 int x = 0;
		 int y = array.length-1;
		 while(x<len&&y>=0) {
			 if(target==array[y][x]) {
				 return true;
			 }else if(target<array[y][x]) {
				 y--;
			 }else {
				 x++;
			 }
		 }
		 return false;
	 }
}
