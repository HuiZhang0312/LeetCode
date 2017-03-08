package easy;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		// bitwise XOR, same number will get 0,and 0^single number =single number
		int a = 0;
        for(int i =0;i<nums.length;i++){
        	a ^= nums[i];
        }
        return a;
    }
	
	public static void main(String[] args){
		int[] b = {1,2,3,1,2};
		SingleNumber sn = new SingleNumber();
		System.out.println(sn.singleNumber(b));
	}
}
