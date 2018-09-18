package unit6;

import java.util.ArrayList;

public class Solution9 {
	public int LastRemaining_Solution(int n, int m) {
		if(m<1)
			return 0;
        if(n==1)
        	return n-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<n;i++)
        	list.add(i);
        int sum = 0;
        while(list.size()!=1) {
        	sum +=m-1;//因为当前位置已经被移除，需要-1;
        	sum = sum%list.size();
        	list.remove(sum);
        }
        return list.remove(0);
    }
}
