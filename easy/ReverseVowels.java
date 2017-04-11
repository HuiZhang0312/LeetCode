package easy;

public class ReverseVowels {
    public String reverseVowels(String s) {
    	//Two pointers
        if(s==null || s.length()==1){
            return s;
        }
        
        char[] cc = s.toCharArray();
        
        int low = 0;
        int high = s.length()-1;
        
        while(low<high){
            if(!helper(s.charAt(low))){
                low++;
            }else if(!helper(s.charAt(high))){
                high--; 
            }else{
                char temp = cc[low];
                cc[low] = cc[high];
                cc[high] = temp;
                low++;
                high--;
            }
        }
        return String.valueOf(cc);
    }
    
    /**
     * Check whether character is vowel
     * */
    public boolean helper(char c){
        char[] cc= {'a','e','i','o','u','A','E','I','O','U'};
        for(char a:cc){
            if(a==c){
                return true;
            }
        }
        return false;
    }
}
