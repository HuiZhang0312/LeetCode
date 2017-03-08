package easy;

import java.util.HashMap;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
    	//************************First solution  HashMap**************************************
//        int[] result = new int[2];
//    	HashMap<Integer, Integer> map = new HashMap<>();
//    	for(int i=0;i<numbers.length;i++){
//    		if(map.containsKey(target-numbers[i])){
//    		    if((i+1)>map.get(target-numbers[i])+1){
//    		        result[0]=map.get(target-numbers[i])+1;
//    		        result[1]=i+1;
//    		        break;
//    		    }
//    			result[0]=i+1;
//    			result[1]=map.get(target-numbers[i])+1;
//    			break;
//    		}
//    		map.put(numbers[i], i);
//    	}
//    	return result;
    	
    	// **********************Second solution  two pointers*************************
        if (numbers == null || numbers.length < 2) return null;
        int[] result = new int[2];
        int p=0,q=numbers.length-1;
        while(p<q){
            int v = numbers[p]+numbers[q];
            if(v==target){
                result[0]=p+1;
                result[1]=q+1;
                break;  
            }else if(v>target){
                q--;
            }else{
                p++;
            }
        }
        return result;
    }	
}
