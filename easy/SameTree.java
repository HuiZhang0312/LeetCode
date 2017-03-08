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
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        // Recursive
		if(p==null && q==null) return true;
		if(p.val==q.val){
			return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
		}
		return false;
    }
}
