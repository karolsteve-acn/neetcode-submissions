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
    private Map<Integer, Integer> map = new HashMap<>();
    private int pIdx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return f(preorder, 0, inorder.length - 1);
    }

    private TreeNode f(int[] preorder, int inLeft, int inRight) {
        if(inLeft > inRight) return null;
        int rootVal = preorder[pIdx++];
        TreeNode root = new TreeNode(rootVal);
        int idx = map.get(rootVal);
        root.left = f(preorder, inLeft, idx - 1);
        root.right = f(preorder, idx + 1, inRight);
        return root;
    }
}
