package easy;

import tool.TreeNode;

public class DiameterOfBinaryTree {
	public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int d = 0;
        if(root.left!=null){
            d++;
            d+=getDepth(root.left);
        }
        if(root.right!=null){
            d++;
            d+=getDepth(root.right);
        }
        return Math.max(d, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
    
    public int getDepth(TreeNode root){
        if(root == null) return 0;
        int depth = 0;
        if(root.left!=null ||root.right!=null){
            depth++;
        }
        return depth + Math.max(getDepth(root.left), getDepth(root.right));
    }
}
