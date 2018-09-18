package unit6;

import org.junit.Test;

public class Solution6 {
	 public String ReverseSentence(String str) {
		int begin = 0;
		int end = str.length()-1;
		str =  reversePart(str,begin,end);
		String s = "";
		while(begin<=end) {
			int start = begin;
			while(begin<=end&&str.charAt(begin)!=' ') {
				begin++;
			}
			s += reversePart(str, start, begin-1);
			while(begin<=end&&str.charAt(begin)==' ') {
				s +=' ';
				begin++;
			}
		}
		return s;
	 }

	private String reversePart(String str, int begin, int end) {
		// TODO Auto-generated method stub
		char[] chs = str.toCharArray();
		int index1 = begin;
		int index2 = end;
		while(index1<index2) {
			swap(chs,index1,index2);
			index1++;
			index2--;
		}
		return new String(chs).substring(begin, end+1);
	}

	private void swap(char[] chs, int begin, int end) {
		// TODO Auto-generated method stub
		char temp = chs[begin];
		chs[begin] = chs[end];
		chs[end] = temp;
	}
	@Test
	public void test() {
		String str = "I am a student.";
		System.out.println(ReverseSentence(str));
	}
}
