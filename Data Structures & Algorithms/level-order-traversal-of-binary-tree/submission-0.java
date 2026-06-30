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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> r = new ArrayList<>();
        recurse(root, 0, r);
        return r;
    }

    private void recurse(TreeNode root, int level, List<List<Integer>> r) {
        if(root == null) {
            return;
        }
        if(r.size() <= level) {
            r.add(new ArrayList<>());
        }
        r.get(level).add(root.val);
        recurse(root.left, level + 1, r);
        recurse(root.right, level + 1, r);
    }
}
