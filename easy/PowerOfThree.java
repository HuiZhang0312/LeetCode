package easy;

public class PowerOfThree {
	
	// ****************************First solution   Fast****************************
	// 1162261467 is 3^19, the max power 3 number within 2^32/2 -1
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;    
    }

    // ****************************Second solution**********************************
//    public boolean isPowerOfThree(int n) {
//        if(n<1) return false;
//        while(n%3==0){
//            n=n/3;
//        }
//        if(n>1){
//            return false;
//        }
//        
//        return true;
//    }
}
