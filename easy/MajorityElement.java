package easy;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		// ***********************First solution come to my mind**************************
		// Not efficient enough
		int result = 0;
		// Use map to record element and how many times it appears
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : nums){	
			if(!map.containsKey(i)){
				map.put(i, 1);
			}else{
				map.put(i, map.get(i)+1);
			}
			// Find element appears more than n/2 times.
			// No need to use another for loop, cause if meet a element with frequency > n/2
			// Then no need to continue and can break
			if(map.get(i)>nums.length/2 ){
			    result = i;
			    break;
			}
		}
		
		return result;
		
		// ***************************Second solution******Sorting********************
		// After sorting, the element in the middle must be the majority element.
		// Time complexity of Arrays sorting algorithm is O(nlogn)
		
//		Arrays.sort(nums);
//		return nums[nums.length/2];
		
		
		// ***************************Third Solution***Moore voting algorithm*********
		// Count means how many voting candidate more than others 
//		int count = 0, result = 0;
//		for(int num: nums){
			// Count = 0 means element before has same voting, so candidate becomes next element
//			if(count==0){
//				result = num;
//			}
			// If num do not equal to result, means another element has one more voting.
//			if(num!=result){
//				count--;
//			}else{
//				count++;
//			}
//		}
    }
}
