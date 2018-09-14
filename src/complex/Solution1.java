package complex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {
	public String PrintMinNumber(int [] numbers) {
		if(numbers==null||numbers.length==0)
			return "";
		int n = numbers.length;
		String[] strs = new String[n];
		for(int i=0;i<n;i++) {
			strs[i] = ""+numbers[i];
		}
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1+o2).compareTo(o2+o1);
			}
		});
		String st = "";
		for(String str:strs) {
			st +=str;
		}
		return st;
	}
}
