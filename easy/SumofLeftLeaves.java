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
public class SumofLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		// First solution come to my mind
		// Always care the edge case
		if(root==null){
			return 0;
		}
		int result = 0;
		
		if(root.left!=null){
			if(root.left.left==null && root.left.right==null){
				result+=root.left.val;
			}
			
			result+=sumOfLeftLeaves(root.left);
		}
			
		result+=sumOfLeftLeaves(root.right);
		
		return result;
		
    }
}
