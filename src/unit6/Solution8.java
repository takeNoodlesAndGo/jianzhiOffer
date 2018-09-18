package unit6;

import java.util.Arrays;

public class Solution8 {
	public boolean isContinuous(int [] numbers) {
		if(numbers==null||numbers.length!=5)
			return false;
		Arrays.sort(numbers);
		int num = 0;
		for(int i =0;i<numbers.length-1;i++) {
			if(numbers[i]==0)
				num++;
			else if(numbers[i]==numbers[i+1])
				return false;
		}
		int min = numbers[num];
		int max = numbers[numbers.length-1];
		if(max-min<=4)
			return true;
		return false;
    }
}
