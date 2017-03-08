package easy;

public class ClimbStairs {
	// Dynamic Programming
	// *********************************First Solution*****************************8*****
	// To get to stair n, we can either take 1 step from 1 step away or take 2 steps from 
	// 2 steps away. So step[n] = step[n-1]+step[n-2]
	// Space complexity is O(n)
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] step= new int[n];
        step[0] = 1;
        step[1] = 2;
        for(int i=2;i<n;i++){
            step[i]=step[i-1]+step[i-2];
        }
        return step[n-1];
    }
    
    // *******************************Second Solution************************************
    // Similiar to the first solution while space complexity is O(1)
//    if(n <= 2) return n;
//    
//    int one_step_before = 2;
//    int two_steps_before = 1;
//    int all_ways = 0;
//
//    for(int i=2; i<n; i++){
//    	all_ways = one_step_before + two_steps_before;
//    	two_steps_before = one_step_before;
//        one_step_before = all_ways;
//    }
//    return all_ways;
    
    // ********************************Third Solution************************************
//    int a = 1, b = 1;
//    while (n-- > 0) a = (b += a) - a;      
//    return a;
}
