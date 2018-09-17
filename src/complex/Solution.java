package complex;

import org.junit.experimental.categories.IncludeCategories;

public class Solution {
	//��������:��1-n�е�����������1���ֵĴ���
	//�ⷨ1:��ֱ�۵��Ǳ���
	//�ⷨ2:��1-21345Ϊ��
	//��Ϊ1-1345��1346-21345������
	//������һ����:��λΪ1��Ϊ10000������Ϊ��λ>1��
	//�ٿ��Ǻ���λ:1346-21345��Ϊ  1346-11345��11346-21345     1���ܺ��� 2*3*10^3  2������λΪ2��3������Ϊ5-3��10^(5-3)
	public int NumberOf1Between1AndN_Solution(int n) {
		if(n<=0)
			return 0;
		String str = new Integer(n).toString();
		return getTimesOfOne(str);
	}

	private int getTimesOfOne(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		int times = 0;
		if(n==0)
			return 0;
		if(n==1) {
			if(Integer.parseInt(str)>=1) {
				return 1;
			}else {
				return 0;
			}
		}
		if(str.charAt(0)=='0') {
			return getTimesOfOne(str.substring(1));
		}
		if(str.charAt(0)=='1') {					
			times += Integer.parseInt(str) - Math.pow(10, n-1)+1;
		}else {
			times += Math.pow(10, n-1);
		}	
		times += Math.pow(10, n-2)*(int)(str.charAt(0)-'0')*(n-1);
		return times += getTimesOfOne(str.substring(1));
	}
}
