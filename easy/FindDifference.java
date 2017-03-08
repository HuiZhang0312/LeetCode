package easy;

public class FindDifference {
	public char findTheDifference(String s, String t) {
        // Solution one, using bit manipulation
		// Long equation may get slower 
//		  char c = t.charAt(t.length()-1);
//        for(int i =0;i<s.length();i++){
//        	c^=s.charAt(i);
//		    c^=t.charAt(i);
//        }
//        return c;
		
		//Solution two, using alphabet
		int[] alpha= new int[26];
        for (int i = 0; i < 26; i++) alpha[i] = 0;
        for (char c : s.toCharArray())
            alpha[ c - 'a' ]++;

        for (char c : t.toCharArray()) {
           //could do decrement first, then check but yeah
            if (--alpha[c - 'a'] < 0)
                return c;
        }

        return 0;
    }
	
	public static void main(String[] args){
		FindDifference fd = new FindDifference();
		System.out.println(fd.findTheDifference("abcd", "adcbe"));
	}
}
