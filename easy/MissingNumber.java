package easy;

import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		// ******************First soluton***********************************
		// Obvious not the best as the use of Array.sort() O(nlogn)
		int result = 0;
        
        Arrays.sort(nums);
        
        while(result==nums[result]){
            result++;
            if(result==nums.length){
                break;
            }
        }
        return result;
        
        
        // ******************Second solution**********************************
        // Use sum
        // If with the missing num, sum will be n(n+1)/2
//        int sum = 0;
//        for(int num:nums){
//            sum+=num;
//        }
//        return (nums.length*(nums.length+1))/2-sum;
        
        
        // ********************Third solution*********************************
        // XOR  a^b^a=b
//        int result = 0;
//        int i = 0;
//        for(;i<nums.length;i++){
//            result = result^i^nums[i];
//        }
//        return result^i;
        
    }
}
