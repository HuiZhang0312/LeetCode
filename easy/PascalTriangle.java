package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 118 Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.
 * */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows < 1) return result;
        
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j < i+1; j++){
                if(j==0 || j==i){
                    row.add(1);  
                }else{
                    row.add(j,result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
                
            }
            result.add(row);
        }
        
        return result;
    }
}
