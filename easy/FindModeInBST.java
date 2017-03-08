package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import tool.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FindModeInBST {
	// ******************First solution********************************
	// Used to record elements and their frequencies
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    
    public int[] findMode(TreeNode root) {
    	// 
        helper(root);
        // Initial max
        int max = 0;
        // Use array list to store all element with max frequency
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(max>entry.getValue()) continue;
            if(max<entry.getValue()){
                max = entry.getValue();
                // If has larger, clear the current list
                l.clear();
                l.add(entry.getKey());
            }else{
                l.add(entry.getKey());
            }
        }
        // Put all elements in list into array
        int[] result = new int[l.size()];
        for(int i = 0;i<l.size();i++){
            result[i] = l.get(i);
        }
        return result;
    }
    // Use helper function to get all elements and their frequencies
    public void helper(TreeNode root){
        if(root==null) return;
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        helper(root.left);
        helper(root.right);
    }
    
    // ****************************Second solution**********************************
    // Much faster
//  private int currVal = 0;
//  private int currCount = 0;
//  private int maxCount = 0;
//  private int modeCount = 0;
//  
//  private int[] modes;
//
//    public int[] findMode(TreeNode root) {
//        inorder(root);
//        modes = new int[modeCount];
//        modeCount = 0;
//        currCount = 0;
//        inorder(root);
//        return modes;
//    }
//
//    private void handleValue(int val) {
//        if (val != currVal) {
//            currVal = val;
//            currCount = 0;
//        }
//        currCount++;
//        if (currCount > maxCount) {
//            maxCount = currCount;
//            modeCount = 1;
//        } else if (currCount == maxCount) {
//            if (modes != null)
//                modes[modeCount] = currVal;
//            modeCount++;
//        }
//    }
//    
//    private void inorder(TreeNode root) {
//        if (root == null) return;
//        inorder(root.left);
//        handleValue(root.val);
//        inorder(root.right);
//    }
}
