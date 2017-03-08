package easy;

public class SearchInsertPosition {
	// ********************First solution*****Straightforward***************
	// O(n)
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return 0;
    }
    
    //******************Second solution*******Binary search****************
    // O(logn) faster
//    int low = 0;
//    int high = nums.length-1;
//    while(low<=high){
//        int mid = (low+high)/2;
//        if(nums[mid]==target){
//            return mid;
//        }
//        if(target<nums[mid]){
//            high = mid-1;
//        }else{
//            low = mid+1;
//        }
//    }
//    return low;
}
