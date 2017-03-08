package easy;

import java.util.HashSet;

public class HappyNum {
    public boolean isHappy(int n) {
    	// ***********************First solution****************************
    	// Use hash set to record all appeared number.
    	// If can't add, means the number already appeared and return false.
        HashSet<Integer> hs = new HashSet<>();
        int num,cur;
        while(hs.add(n)){
            num = 0;
            while(n>0){
                cur = n%10;
                cur = cur*cur;
                num+=cur;
                n/=10; 
            }
            if(num==1){
                return true;
            }else{
                n=num;
            }
        }
        return false;
        
        
        // ************************Second solution**************************
        // Record one number, if meet the number again return false.
//        public boolean isHappy(int n) {
//            int x = n;
//            int y = n;
//            while(x>1){
// Keep calculating
//                x = cal(x) ;
//                if(x==1) return true ;
// Record one number
//                y = cal(cal(y));
//                if(y==1) return true ;
//
//                if(x==y) return false;
//            }
//            return true ;
//        }
//        public int cal(int n){
//            int x = n;
//            int s = 0;
//            while(x>0){
//                s = s+(x%10)*(x%10);
//                x = x/10;
//            }
//            return s ;
//        }
    }
}
