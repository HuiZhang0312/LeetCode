package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrayII {
	public int[] intersect(int[] nums1, int[] nums2) {
		// ******************************First solution**********************************
		// Use HashMap to record one list
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int num:nums1){
        	if(!hm.containsKey(num))
        		hm.put(num, 1);
        	else
        		hm.put(num, hm.get(num)+1);
        }
        // Use temp list record intersection
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
        	if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0){
        	    temp.add(nums2[i]);
        		hm.put(nums2[i], hm.get(nums2[i])-1);
        	}
        }
        // Put result into array
        int[] result = new int[temp.size()];
        for(int i =0;i<temp.size();i++){
        	result[i] = temp.get(i);
        }
        
        return result;
        
        // ****************************Second solution*********************************
        // If arrays are sorted, use 2 pointer to mark which has been compared
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        List<Integer> temp = new ArrayList<Integer>();
//        // Initial two pointers
//        int p1 = 0, p2 = 0;
//        // Go through two array
//        while(p1<nums1.length && p2<nums2.length){
//        	if(nums1[p1]<nums2[p2]){
//        		p1++;
//        	}else if(nums1[p1]>nums2[p2]){
//        		p2++;
//        	}else{
//        		temp.add(nums1[p1]);
//        		p1++;
//        		p2++;
//        	}
//        }
//        int[] result = new int[temp.size()];
//        for(int i:temp){
//        	result[i] = temp.get(i);
//        }
//        return result;
    }
}
