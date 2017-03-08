package easy;

public class NumberComplement {
	public int findComplement(int num) {
		//My first solution
//        String a = Integer.toBinaryString(num).trim();
//        String b = "";
//        for(int i=0;i<a.length();i++){
//            if(a.charAt(i)=='0'){
//                b+="1";
//            }else{
//                b+="0";
//            }
//        }
//        int c = Integer.parseInt(b,2);
//        return c;
		
		//Second solution
		//Can't get complement directly as integer has 32 bits
//		int mask = (Integer.highestOneBit(num)<<1)-1;
//		return ~num & mask;
		
		//Third solution
		//~num get 32 bits with lots of 1 s before, and negative
		//Integer.highestOneBit(num)<<1 is used to turn all 1 s to 0 and positive
		return ~num+(Integer.highestOneBit(num)<<1);
    }
	
	public static void main(String[] args){
		NumberComplement nc = new NumberComplement();
		int i = nc.findComplement(8);
		System.out.println(i);
	}
}
