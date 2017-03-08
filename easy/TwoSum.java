package easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	// ****************Straightforward solution   O(n^2)***********************************
//        int[] result = new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    result[0]=i;
//                    result[1]=j;
//                    break;
//                }
//            }
//        }
//        return result;
    
    	
    	// ****************************Better solution   HashMap******************************
    	int[] result = new int[2];
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++){
    		if(map.containsKey(target-nums[i])){
    			result[0]=i;
    			result[1]=map.get(target-nums[i]);
    		}
    		map.put(nums[i], i);
    	}
    	return result;
    }	
}
