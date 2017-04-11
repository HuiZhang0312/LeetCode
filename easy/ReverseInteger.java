package easy;

public class ReverseInteger {
    public int reverse(int x) {
        int r = 0;
        
        while(x!=0){
            int tail = x%10;
            int temp = r*10 + tail;
            //May overflow here
            if((temp-tail)/10 != r) return 0;
            r = temp;
            x/=10;
        }
        return r;
    }
}
