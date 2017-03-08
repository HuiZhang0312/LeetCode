package easy;

import java.util.HashMap;

public class NumberOfBoomerang {
	public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int[] a:points){
            for(int[] b:points){
            	// If same point, go to next loop
                if(a==b) {continue;}
                // No need to get square root
                int ds = (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);
                // getOrDefault() if value exists, get value. 
                // if don't exist, get the set default value in the function
                map.put(ds, map.getOrDefault(ds,0)+1);
            }
            // For all points have same distance to point a
            for(int v:map.values()){
            	result+=v*(v-1);
            }
            map.clear();
        }
        return result;
    }
}
