package easy;

public class RepeatedSubstring {
	// *******************************First solution**********************************
	// Check substrings, if repeat that substring and can get the same string, return true. 
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int i = 1;i<len/2+1;i++){
            if(len%i==0){
                String sub = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<len/i;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
    
    // *****************************Second solution***********************************
}
