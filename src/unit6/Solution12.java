package unit6;

public class Solution12 {
	public int StrToInt(String str) {
        if(str==null||str.length()==0)
        	return 0;
        boolean flag = true;
        if(str.startsWith("-")) {
        	flag = false;
        	str = str.substring(1);
        }else if(str.startsWith("+")) {
        	str = str.substring(1);
        }
        char[] chs = str.toCharArray();
        if(chs.length==0)
        	return 0;
        int len = 0;
        long  num = 0;
        for(int i=chs.length-1;i>=0;i--,len++) {
        	if(chs[i]>='0'&&chs[i]<='9')
        		num += (chs[i]-'0')*Math.pow(10, len);
        	else
        		return 0;
        }
        if(flag==false)
        	num = -num;
        return (int) num;
    }
}
