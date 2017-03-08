package easy;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		// If length different, can't be anagram.
		if(s.length()!=t.length()) return false;
		// Initial alphabet
		int[] alpha = new int[26];
		for(int i = 0;i<26;i++){
			alpha[i] = 0;
		}
		
		// Check each character solution 1
		for (int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i)-'a']++;
			alpha[t.charAt(i)-'a']--;
		}
		// Check each character solution 2, takes more spaces but lot faster!! 
//		for(char c: s.toCharArray()) {
//		       alpha[c-'a']++;
//		}
//		    
//		for(char c: t.toCharArray()) {
//		       alpha[c-'a']--;
//		}
		
		// If all character in alphabet has 0 return true, else return false.
		for(int i = 0;i<26;i++){
			if(alpha[i]!=0){
				return false;
			}
		}
		
		return true;
    }
}
