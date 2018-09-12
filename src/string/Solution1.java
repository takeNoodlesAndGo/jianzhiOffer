package string;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution1 {
	public ArrayList<String> list = new ArrayList<String>();
	public ArrayList<String> Permutation(String str) {
		if(str==null||str.length()==0)
			return list;
		combine(str.toCharArray(),0);
		Collections.sort(list);
		return list;
	}
	private void combine(char[] chars, int begin) {
		// TODO Auto-generated method stub
		if(begin==chars.length) {
			String result = String.valueOf(chars);
			if(!list.contains(result)) {
				list.add(result);
			}
			return ;
		}
		for(int i=begin;i<chars.length;i++) {
			swap(chars,i,begin);
			combine(chars, begin+1);
			swap(chars,i,begin);
		}	
	}
	private void swap(char[] chars, int i, int j) {
		// TODO Auto-generated method stub
		char ch = chars[i];
		chars[i] = chars[j];
		chars[j] = ch;
	}
}
