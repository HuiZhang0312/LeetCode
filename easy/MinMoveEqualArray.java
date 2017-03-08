package easy;

import java.util.Arrays;

public class MinMoveEqualArray {
	public int minMoves(int[] nums) {
        // ******************Time limited exceeded!******************
//		int result = 0;
//        
//        Arrays.sort(nums);
//        while(nums[0]!=nums[nums.length-1]){
//        	nums[0]++;
//        	nums[1]++;
//        	result++;
//        	Arrays.sort(nums);;
//        }
//        
//        
//        return result;
		
		// Second solution, result = sum of all difference between the smallest element
//		int result =0;
//		Arrays.sort(nums);
//		for(int i:nums){
//			result+=i-nums[0];
//		}
//		return result;
		
		// Then better
		int result =0;
		// No need to get all sorted, just need the min
		int min = nums[0];
		// Find the min num
        for (int n : nums) min = Math.min(min, n);
		for(int i:nums){
			result+=i-min;
		}
		return result;
    }
}
