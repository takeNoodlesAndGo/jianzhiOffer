package string;

public class Solution {
	//½«¿Õ¸ñÌæ»»Îª%20
	public String replaceSpace(StringBuffer str) {
        String string = "";
    	if(str==null)
            return string;
        int n = str.length();
        String str1 = "%20";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            if(str.charAt(i)==' ')
                sb.append(str1);
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
