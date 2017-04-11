package easy;

public class HouseRobber {
    /**
    * Dynamic Programming
    */
    public int rob(int[] nums) {
        // Handle invalid input.
        if(nums == null || nums.length == 0) return 0;
        
        // Initial
        // Previous house robbed.
        int preY = 0; 
        // Previous house not robbed.
        int preN = 0; 
        
        for(int n:nums){
            // If don't rob current house, then set curN to max of robbed and didn't rob previous house.
            int curN = Math.max(preY,preN);
            // If rob current house, then previous house can't be robbed. Just add current house value and preN
            int curY = preN + n;
            // Update for next round
            preN = curN;
            preY = curY;
        }
        // Return larger value
        return Math.max(preY,preN);
    }
}
