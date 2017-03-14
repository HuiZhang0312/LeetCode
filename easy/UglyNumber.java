package easy;
/*Write a program to check whether a given number is an ugly number.
Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
Note that 1 is typically treated as an ugly number.*/
public class UglyNumber {
	
	public boolean isUgly(int num) {
		// **********************************First solution************************************
		// Special case
        if(num==1){return true;}
        if(num==0){return false;}
        // If ugly, then must be 1 in the end.
        while(num!=1){
            if(num%2==0){
                num/=2;
            }else if(num%3==0){
                num/=3;
            }else if(num%5==0){
                num/=5;
            }else{
                break;
            }
        }
        if(num!=1){
            return false;
        }
        return true;
        
		// **********************************Second solution************************************
        // More elegant code.
//        for (int i=2; i<6 && num>0; i++)
//            while (num % i == 0)
//                num /= i;
//        return num == 1;
        
        // **********************************Third solution*************************************
        // Basically, same idea.
//        if (num <= 0) {
//            return false;
//        }
//        
//        int[] divisors = {2, 3, 5};
//        
//        for(int d : divisors) {
//            while (num % d == 0) {
//                num /= d;
//            }
//        }
//        return num == 1;
    }
}
