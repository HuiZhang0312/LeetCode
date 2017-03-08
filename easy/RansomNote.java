package easy;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		// Try to use alphabet to solve problems related to string
		int[] alpha = new int[26];
		
		for(char m:magazine.toCharArray()){
			alpha[m-'a']++;
		}
		
		for(char r:ransomNote.toCharArray()){
			if(--alpha[r-'a']<0){
				return false;
			}
		}
		return true;
    }
}
