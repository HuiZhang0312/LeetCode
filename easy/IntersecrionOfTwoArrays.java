package easy;

import java.util.HashSet;

public class IntersecrionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> intersec = new HashSet<Integer>();
		for(int i:nums1){
			set.add(i);
		}
		for(int j:nums2){
			if(set.contains(j)){
				intersec.add(j);
			}
		}
		int[] result = new int[intersec.size()];
		
		// If the size of array is large enough, we can use this way.
		// Don't have to use loop.
		int i = 0;
		
		for(int num:intersec){
			result[i++] = num;
		}
		
		return result;
    }
}
