package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDispearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		//My solution with time limited exceeded
		//Which means it's correct but not efficient
//        List<Integer> result = new ArrayList<Integer>();
//        List<Integer> a = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        for(int i=0;i<nums.length;i++){
//        	if(!(a.contains(i+1))){
//        		result.add(i+1);
//        	}
//        }
//        
//        return result;
		
		//Better solution without extra space
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0;i<nums.length;i++){
			int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
		}
		
		for(int j = 0;j<nums.length;j++){
			if(nums[j]>0){
				result.add(j+1);
			}
		}
		return result;
    }
	
	public static void main(String[] args){
		int[] nums = {4,3,2,7,8,2,3,1};
		FindDispearedNumbers fdn = new FindDispearedNumbers();
		List<Integer> b = fdn.findDisappearedNumbers(nums);
		for(int c:b){
			System.out.println(c);
		}
 	}
}
