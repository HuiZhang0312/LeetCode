package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
	// *******************First solution********Straightforward way*********************
	List<Character> a = Arrays.asList('q','w','e','r','t','y','u','i','o','p');
    List<Character> b = Arrays.asList('a','s','d','f','g','h','j','k','l');
    List<Character> c = Arrays.asList('z','x','c','v','b','n','m');
    public String[] findWords(String[] words) {
        ArrayList<String> temp = new ArrayList<String>();
        for(String word : words){
        	// Convert to lower case to compare
            String lowerCase = word.toLowerCase();
            // Count how many times each row's characters appears 
            int countA = 0;
            int countB = 0;
            int countC = 0;
            for(char c : lowerCase.toCharArray()){
                if(a.contains(c)){
                    countA++;
                }else if(b.contains(c)){
                    countB++;
                }else{
                    countC++;
                }
            }
            // If one row's count equals to length of the word, then add to result list
            if(countA==lowerCase.length()||countB==lowerCase.length()||countC==lowerCase.length()){
                temp.add(word);
            }
        }
        String[] result = new String[temp.size()];
        for(int i=0;i<result.length;i++){
            result[i]=temp.get(i);
        }
        return result;
    }
    
    // *************Second solution*******************A bit different*******************
//  String[] base = {"qwertyuiop","asdfghjkl","zxcvbnm"};
//	List<String> list = new ArrayList<String>();
//	for (String string : words) {
//		for (String basStr : base) {
//			boolean find = true;
//			for (char c : string.toCharArray()) {
//				String low = String.valueOf(c).toLowerCase();
//				if (!basStr.contains(low)){
//					find = false;
//					break;
//				}
//			}
//			if (find) list.add(string);
//		}
//	}
//	String[] res = new String[list.size()];
//	for (int i = 0; i < res.length; i++) res[i] = list.get(i);
//	return res;
}
