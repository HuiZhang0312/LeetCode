package easy;

import tool.TreeNode;

public class InvertTree {
	public TreeNode invertTree(TreeNode root) {
		// *************************Recursive*************************
		if(root==null){
			return null;
		}
		
		TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root;
        
        // *************************Use stack*************************
//        if (root == null) {
//            return null;
//        }
//
//        final Deque<TreeNode> stack = new LinkedList<>();
//        stack.push(root);
//        
//        while(!stack.isEmpty()) {
//            final TreeNode node = stack.pop();
//            final TreeNode left = node.left;
//            node.left = node.right;
//            node.right = left;
//            
//            if(node.left != null) {
//                stack.push(node.left);
//            }
//            if(node.right != null) {
//                stack.push(node.right);
//            }
//        }
//        return root;
        
        // *************************Use queue**************************
//        if (root == null) {
//            return null;
//        }
//
//        final Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//            final TreeNode node = queue.poll();
//            final TreeNode left = node.left;
//            node.left = node.right;
//            node.right = left;
//
//            if(node.left != null) {
//                queue.offer(node.left);
//            }
//            if(node.right != null) {
//                queue.offer(node.right);
//            }
//        }
//        return root;
    }
}
