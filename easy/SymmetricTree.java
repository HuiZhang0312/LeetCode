package easy;

import tool.TreeNode;

/**
 * LeetCode 101 Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * */
public class SymmetricTree {
	// ******************************First solution (Recursive)*********************************
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    
    private boolean helper(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null ||p.val!=q.val) return false;
        return helper(p.left,q.right) && helper(p.right, q.left);
    }
    
    
    // ******************************Second solution DFS********************************************
//    public boolean isSymmetric(TreeNode root) { 
//    	if(root == null) return true;
//        Stack<TreeNode> s = new Stack<TreeNode>();
//        s.push(root.left);
//        s.push(root.right);
//        while(!s.isEmpty()){
//            TreeNode right = s.pop(), left = s.pop();
//            if(right == null && left ==null) continue;
//            if(right == null || left ==null || left.val!=right.val) return false;
//            s.push(left.left);
//            s.push(right.right);
//            s.push(left.right);
//            s.push(right.left);
//        }
//        return true;
//    }
}
