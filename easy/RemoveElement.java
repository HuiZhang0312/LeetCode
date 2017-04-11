package easy;
/**
 * LeetCode 27 Remove Element
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		// ********************************First solution*************************************
        // If position i equals to val, i-- will always make sure position i changed. 
        // int l = nums.length;
        // for (int i=0; i<l; i++) {
        //     if (nums[i] == val) {
        //         nums[i--] = nums[l-- -1];
        //     }
        // }
        // return l;
        
		// ********************************Second solution*************************************
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
