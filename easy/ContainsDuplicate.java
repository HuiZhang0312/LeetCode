package easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		// ************************First solution******HashSet*************
		HashSet<Integer> hs = new HashSet<Integer>();
        for(int num:nums){
            if(hs.contains(num)){
                return true;  
            } 
            else hs.add(num);
        }
        return false;
        
        //***********************Second solution***************************
        // Sort the array
//        Arrays.sort(nums);
        // If has numbers next to each other equal, return true
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==nums[i-1]) return true;
//        }
//        return false;
        
        
    }
}
