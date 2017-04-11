package easy;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        // Square is 1+3+5+...
        if(num < 1) return false;
        int i = 1;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
        
        
        //*******************************Second solution******************************
//        if (num < 1) return false;
//        long left = 1, right = num;// long type to avoid 2147483647 case
//      
//        while (left <= right) {
//          long mid = (right + left) / 2;
//          long t = mid * mid;
//          if (t > num) {
//            right = mid - 1;
//          } else if (t < num) {
//            left = mid + 1;
//          } else {
//            return true;
//          }
//        }
//      
//        return false;
    }
}
