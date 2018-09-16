package complex;

public class Solution2 {
	public int GetUglyNumber_Solution(int index) {
		if(index==0)
			return 0;
		int[] arr = new int[index];
		arr[0] = 1;
		int m = 1;
		for(int i =1;i<index;i++) {
			int m2 = cal(arr,m,2);
			int m3 = cal(arr,m,3);
			int m5 = cal(arr,m,5);
			if(m2>m3)
				m = m3;
			else {
				m = m2;
			}
			if(m>m5) {
				m = m5;
			}
			arr[i] = m;
		}
		return arr[index-1];
	}

	private int cal(int[] arr, int m, int ra) {
		// TODO Auto-generated method stub
		for(int j = 0;j<arr.length;j++) {
			if(arr[j]*ra>m)
				return arr[j]*ra;
		}
		return 0;
	}
}
