package easy;

public class AddString {
	public String addStrings(String num1, String num2) {
		// Just add each bit, if>10, then add 1 
		if(num1==null&&num2==null) return null;
        StringBuilder sb = new StringBuilder();
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        int carry = 0;
        int temp = 0;
        while(p1>=0||p2>=0){// Care = 0
        	// Get number using ASCII code
            int first = p1>=0?num1.charAt(p1)-'0':0;
            int second = p2>=0?num2.charAt(p2)-'0':0;
            temp = first + second + carry;
            if(temp<10){
                sb.insert(0,temp);
                carry = 0;
            }else{
                carry = 1;
                sb.insert(0,temp%10);
            }
            p1--;
            p2--;
        }
        if(carry == 1){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}
