package easy;

/**
 * LeetCode 434 Number of Segments in a String
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * */
public class CountSegments {
    public int countSegments(String s) {
    	// *****************************First Solution*****************************
        //return ("s "+s).trim().split(" +").length-1;
        
    	//******************************Second Solution****************************
        // if(s.trim().length() == 0) return 0;
        // return s.trim().split(" +").length;
        
    	// *****************************Third Solution*****************************
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            // Count how many pairs space and first character
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) count++;
        }
        return count;
    }
}
