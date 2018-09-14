package complex;

import org.junit.experimental.categories.IncludeCategories;

public class Solution {
	//问题描述:从1-n中的所有整数中1出现的次数
	//解法1:最直观的是遍历
	//解法2:以1-21345为例
	//分为1-1345和1346-21345两部分
	//分析后一部分:万位为1的为10000个（因为万位>1）
	//再考虑后四位:1346-21345分为  1346-11345和11346-21345     1的总和是 2*3*10^3  2代表万位为2，3代表长度为5-3，10^(5-3)
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
