package easy;

import java.util.Arrays;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        // To solve this question, two arrays must be sorted
        Arrays.sort(g);
        Arrays.sort(s);
        // Maximum is g length
        for(int i=0;result<g.length && i<s.length;i++){
        	if(g[result]<=s[i]){
        		result++;
        	}
        }
        
        return result;
    }
}
