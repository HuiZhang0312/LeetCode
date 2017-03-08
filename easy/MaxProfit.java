package easy;

public class MaxProfit {
	// ******************************First solution****************************
    public int maxProfit(int[] prices) {
    	// If null, return 0.
        if(prices==null||prices.length==0){
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++){
        	// Keep min has smallest value
            if(prices[i]<min){
                min = prices[i];
                continue;
            // Get the max profit for now
            }else if(prices[i]-min>max){
                max = prices[i]-min;
            }
        }
        return max;
    }
    
    // *************************Second solution*******************************
    // Kadane's Algorithm
//    public int maxProfit(int[] prices) {
//        int maxCur = 0, maxSoFar = 0;
//        for(int i = 1; i < prices.length; i++) {
//            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
//            maxSoFar = Math.max(maxCur, maxSoFar);
//        }
//        return maxSoFar;
//    }
}
