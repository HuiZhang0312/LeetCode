package medium;

import java.util.HashMap;
/**
 * 3. Longest Substring Without Repeating Characters
 * */
public class LongestSubstringWithoutRepeatChar {
    public int lengthOfLongestSubstring(String s) {
    	// Base case
        if(s.length()==0) return 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        
        for(int i = 0, j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
            	// Move forward one position
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
       
        return max;
    }
}
