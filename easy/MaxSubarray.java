package easy;

public class MaxSubarray {
	// *****************************First solution*****************************
	// Similar to best time to buy and sell stock
    public int maxSubArray(int[] nums) {
        int maxCur = nums[0], maxSoFar = nums[0];
        for(int i = 1;i<nums.length;i++){
            maxCur = Math.max(nums[i],maxCur+=nums[i]);
            maxSoFar = Math.max(maxCur,maxSoFar);
        }
        return maxSoFar;
    }
}
