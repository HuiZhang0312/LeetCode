package easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
    	// 1073741824 is 2^16, max power 2 value within Integer.Max_value
        return n>0 && 1073741824%n==0;
        
        // Use bitCount method
//        return n>0 && Integer.bitCount(n) == 1;
    }
}
