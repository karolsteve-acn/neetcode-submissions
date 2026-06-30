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
    private int inc = 0;
    public int kthSmallest(TreeNode root, int k) {
        int[] arr = new int[k];
        traverse(root, n ->{
            if(inc < k) arr[inc++] = n.val;
        });
        return arr[k - 1];
    }
    private void traverse(TreeNode root, java.util.function.Consumer<TreeNode> visitor) {
        if(root == null) return;
        traverse(root.left, visitor);
        visitor.accept(root);
        traverse(root.right, visitor);
    }
}
