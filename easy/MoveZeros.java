package easy;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        // ************My solution O(n^2), not good************
		for(int i=0;i<nums.length;i++){
        	for(int j=i;j<nums.length;j++){
        		if(nums[i]==0){
        			int temp = nums[i];
        		    nums[i]=nums[j];
        		    nums[j]=temp;
        		    //Seems the way below is not fast
//        			nums[i]^=nums[j];
//        			nums[j]^=nums[i];
//        			nums[i]^=nums[j];
        		}
        	}
        }
		
		// ****************Better solution O(n)****************
//		int idx = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                nums[idx]=nums[i];
//                idx++;
//            }
//        }
//        while(idx<nums.length){
//            nums[idx++]=0;
//        }
    }
}
