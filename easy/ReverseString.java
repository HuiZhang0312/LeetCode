package easy;

public class ReverseString {
	public String reverseString(String s) {
		//Other solution one 164740ns
//	    StringBuilder sb = new StringBuilder(s);
//	    return sb.reverse().toString();

	    //Other solution two
//	    char[] word = s.toCharArray();
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j) {
//            char temp = word[i];
//            word[i] = word[j];
//            word[j] = temp;
//            i++;
//            j--;
//        }
//        return new String(word);
		
		//Other solution three
//		 int length = s.length();
//	     if (length <= 1) return s;
//	     String leftStr = s.substring(0, length / 2);
//	     String rightStr = s.substring(length / 2, length);
//	     return reverseString(rightStr) + reverseString(leftStr);
	    
		//My solution 192395ns
		StringBuilder sb = new StringBuilder();
		char[] a = s.toCharArray();
		for(int i=0; i<a.length;i++){
			sb.append(a[a.length-i-1]);
		}
		return sb.toString(); 
    }
	
	public static void main(String[] args){
		ReverseString rs = new ReverseString();
		long start = System.nanoTime();
		System.out.println(rs.reverseString("hello"));
		long end = System.nanoTime();
		System.out.println(end-start);
	}
}
