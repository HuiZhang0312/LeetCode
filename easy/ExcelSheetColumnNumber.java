package easy;

/**
 * Calculate with scale of 26
 * */
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        int result = 0;
        
        char[] c = s.toCharArray();
        
        for(int i=0;i<c.length;i++){
        	result = result*26+c[i]-'A'+1;
        }
        
        return result;
    }
}
