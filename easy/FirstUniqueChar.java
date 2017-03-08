package easy;

public class FirstUniqueChar {
	public int firstUniqChar(String s) {
		// If don't exist, return -1
		int result = -1;
       
		// Set alphabet. If string has special character, then size should be 256!
		int[] alpha = new int[26];
       
		for(int i = 0;i<26;i++){
			alpha[i] = 0;
		}
  
		// Save each character in s in char array c
		char[] c = s.toCharArray();
        // Count number of each character
		for(char cc:c){
			alpha[cc-'a']++;
		}
       
		// Find the first character in string appear once
		for(int i = 0;i<c.length;i++){
			if(alpha[c[i]-'a']==1){
				result=i;
				// If found, then break
				break;
			}
		}

		return result;
		
		// Second solution
		// Looks easier, but in fact O(n^2) and used built in string method
//		char[] a = s.toCharArray();
//		
//		for(int i=0; i<a.length;i++){
//			if(s.indexOf(a[i])==s.lastIndexOf(a[i])){return i;}
//		}
//		return -1;
		
		
		// Third solution
		// Use two pointer to scan
//		if (s==null || s.length()==0) return -1;
//        int len = s.length();
//        if (len==1) return 0;
//        char[] cc = s.toCharArray();
//        int slow =0, fast=1;
//        int[] count = new int[256];
//        count[cc[slow]]++;
//        while (fast < len) {
//            count[cc[fast]]++;
//            // if slow pointer is not a unique character anymore, move to the next unique one
//            while (slow < len && count[cc[slow]] > 1) slow++;  
//            if (slow >= len) return -1; // no unique character exist
//            if (count[cc[slow]]==0) { // not yet visited by the fast pointer
//                count[cc[slow]]++; 
//                fast=slow; // reset the fast pointer
//            }
//            fast++;
//        }
//        return slow;
    }
}
