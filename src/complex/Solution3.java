package complex;

public class Solution3 {
	public int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()==0)
            return -1;
        int len = str.length();
        int[] arr = new int[256];
        for(int i =0;i<len;i++){
            arr[(int)str.charAt(i)]+=1;
        }
        for(int i =0;i<len;i++){
            if(arr[(int)str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
