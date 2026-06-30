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
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(nodeEquals(node, subRoot)) {
                return true;
            }
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
        return false;
    }

    private boolean nodeEquals(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val == right.val) {
            return nodeEquals(left.left, right.left) && nodeEquals(left.right, right.right);
        }
        return false;
    }
}
