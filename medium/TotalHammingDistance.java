package medium;

public class TotalHammingDistance {
	//Time limit exceeded
	public int totalHammingDistance(int[] nums) {
        int a = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                a+=Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return a;
    }
	
	public static void main(String[] args){
		
	}
}
