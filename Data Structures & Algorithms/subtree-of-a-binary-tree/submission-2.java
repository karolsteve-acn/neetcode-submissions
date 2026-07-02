/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(treeEquals(curr, subRoot)) return true;
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
        }
        return false;
    }

    public boolean treeEquals(TreeNode lhs, TreeNode rhs) {
        if(lhs == null && rhs == null) return true;
        if(lhs == null || rhs == null) return false;
        if(lhs.val != rhs.val) return false;
        return treeEquals(lhs.left, rhs.left) && treeEquals(lhs.right, rhs.right);
    }
}
