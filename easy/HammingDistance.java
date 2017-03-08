package easy;

public class HammingDistance {
	//Best solution
	
//	public int hammingDistance(int x, int y) {
		// bitCount function returns the 1s in binary
//		return Integer.bitCount(x ^ y);
//	}
	
	//My solution
	public int hammingDistance(int x, int y) {
        int i = 0;
        String a = Integer.toBinaryString(x).trim();
        String b = Integer.toBinaryString(y).trim();
        System.out.println(a+":"+a.length());
        System.out.println(b+":"+b.length());
        
        int length = a.length();
        int diff = Math.abs(a.length()-b.length());
        
        if(a.length()>b.length()){
        	for(int j=0;j<diff;j++){
        		b = "0"+b;
        	}
        }else if(a.length()<b.length()){
        	for(int n=0;n<diff;n++){
        		a = "0"+a;
        	}
        	length = b.length(); 
        }
        
        System.out.println(a);
        System.out.println(b);
        
        for(int m=0;m<length;m++){
        	if(a.charAt(m)!=b.charAt(m)){
        		i++;
        	}
        }
        
        return i;
    }
	
	public static void main(String[] args){
		HammingDistance hd = new HammingDistance();
		int diff= hd.hammingDistance(1,8);
		System.out.println(diff);
	}
}
