package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
	public List<String> readBinaryWatch(int num) {
		// ****************************First solution*******************************
		// Use array list as no need to delete
        List<String> result = new ArrayList<String>();
        
        // 12 hours and 60 minutes
        for(int i=0;i<12;i++){
        	for(int j=0;j<60;j++){
        		// Count 1 bits in two's complement
        		if(Integer.bitCount(i)+Integer.bitCount(j)==num){
        			// First way to format
        			result.add(i+":"+(j>9?j:"0"+j));
        			// Second way
        			//result.add(String.format("%d:02%d", i,j));
        		}
        	}
        }
        
        return result;
        
        
        // ***************Second solution************Straight forward************
        // List all possibilities as it's limited
//        String[][] hour = {{"0"}, 
//        		{"1", "2", "4", "8"},
//        		{"3", "5", "6", "9", "10"},
//        		{"7", "11"}};
//        String[][] minute = {{"00"}, //1
//        		{"01", "02", "04", "08", "16", "32"}, //6
//        		{"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"}, //15
//        		{"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"}, //20
//        		{"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"}, //14
//        		{"31", "47", "55", "59"}}; //4
//        public List<String> readBinaryWatch(int num) {
//        	List<String> result = new ArrayList();
//        	for (int i = 0; i <= 3 && i <= num; i++) {
//        		if (num - i <= 5) {
//        			for (String str1 : hour[i]) {
//        				for (String str2 : minute[num - i]) {
//        					ret.add(str1 + ":" + str2);
//        				}
//        			}
//        		}
//        	}
//        	return result;  
        
        
        // *************Third solution**************Backtracking********************
//        List<String> res = new ArrayList<>();
//        int[] nums1 = new int[]{8, 4, 2, 1}, nums2 = new int[]{32, 16, 8, 4, 2, 1};
//        for(int i = 0; i <= num; i++) {
//            List<Integer> list1 = generateDigit(nums1, i);
//            List<Integer> list2 = generateDigit(nums2, num - i);
//            for(int num1: list1) {
//                if(num1 >= 12) continue;
//                for(int num2: list2) {
//                    if(num2 >= 60) continue;
//                    res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
//                }
//            }
//        }
//        return res;
//    }
//
//    private List<Integer> generateDigit(int[] nums, int count) {
//        List<Integer> res = new ArrayList<>();
//        generateDigitHelper(nums, count, 0, 0, res);
//        return res;
//    }
//
//    private void generateDigitHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
//        if(count == 0) {
//            res.add(sum);
//            return;
//        }
//        
//        for(int i = pos; i < nums.length; i++) {
//            generateDigitHelper(nums, count - 1, i + 1, sum + nums[i], res);    
//        }
//    }
    }
}
