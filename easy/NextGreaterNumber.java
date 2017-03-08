package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class NextGreaterNumber {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		// Used to store result
        ArrayList<Integer> temp = new ArrayList<Integer>();
        // Store info of nums[]
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        // Compare num in first array and nums after num in second array
        for(int i = 0;i<findNums.length;i++){
            for(int j = map.get(findNums[i]);j<nums.length;j++){
                if(j==nums.length-1){
                    temp.add(-1);
                    break;
                }
                if(nums[j+1]>findNums[i]){
                    temp.add(nums[j+1]);
                    break;
                }
            }
        }
        // Put elements into result array
        int[] result = new int[temp.size()];
        for(int i = 0;i<result.length;i++){
            result[i] = temp.get(i);
        }
        return result;
    }
}
