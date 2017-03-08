package easy;

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
public class SortedArrayToBST {
	// Recursive
	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null) return null;
        TreeNode root = helper(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode helper(int[] nums,int low,int high){
        if(low>high) return null;
        int mid =(low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,low,mid-1);
        root.right = helper(nums,mid+1,high);
        return root;
    }
}
