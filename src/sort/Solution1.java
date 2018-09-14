package sort;

import java.util.ArrayList;

public class Solution1 {
	//��ĿҪ��Ϊ��Сk����
	//�ⷨ1�������뵽���ǽ�������Ȼ��ѡȡǰk������ʱ�临�Ӷ�ΪO(nlogn)
	//�ⷨ2����ΪҪ���ǻ����С��k������������Ҫ֪��k�����Ĵ�С˳��
    //��˿���ʹ�ÿ��ŵ�partition������˼�룬��k�������Ϊ��С��k�������ұ�Ϊ�����������  O(n)���Ӷ�
	//�ⷨ3��������鳤�Ⱥܴ�k��С����������Ǻ������ݴ�����Ҫ����k���������ѡ�
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
