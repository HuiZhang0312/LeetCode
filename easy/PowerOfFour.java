package easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        while(num>=4){
            if(num%4==0){
                num/=4;
            }else{
                break;
            } 
        }
        if(num == 1) return true;
        
        return false;
    }
}
