package easy;

import java.util.HashSet;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		// *************************First solution*****************************
		if(s==null || s.length()==0) return 0;
		int result = 0;
        // Use array to save number of each letter
        int[] alpha = new int[52];
        
        for(int i = 0;i<52;i++) alpha[i]=0;
        
        for(char c:s.toCharArray()){
            // Upper letter take first 26 and lower letter take last 26
        	if(c-'A'<26) alpha[c-'A']++;
            else alpha[c-'a'+26]++;
        }
        
        for(int i:alpha){
        	// Add even letter number to result
            if(i%2==0) result+=i;
            else{
            	// Add odd letter number-1 to result, make most use of letters
                result+=i-1;
            } 
        }
        // If has no odd letter,return result. Else return result+1
        return result==s.length()?result:result+1;
        
        // *************************Second solution*******************************
        // Less efficient than first solution
        // If convert string to char array, will take more space but faster(not as fast as first solution).
//        if(s==null || s.length()==0) return 0;
//        int count = 0;
//        HashSet<Character> hs = new HashSet<Character>();
//        for(int i = 0;i<s.length();i++){
//        	if(hs.contains(s.charAt(i))){
//        		hs.remove(s.charAt(i));
//        		count++;
//        	}else{
//        		hs.add(s.charAt(i));
//        	}
//        }
//        if(!hs.isEmpty()) return count*2+1;
//        
//        return count*2;
    }
}
