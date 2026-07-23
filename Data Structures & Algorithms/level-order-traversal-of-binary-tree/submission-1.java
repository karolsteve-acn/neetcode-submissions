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
        if(root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int sz = q.size();
            List<Integer> row = new ArrayList<>(sz);
            for(int i = 0; i < sz; i++) {
                TreeNode item = q.poll();
                row.add(item.val);
                if(item.left != null) q.add(item.left);
                if(item.right != null) q.add(item.right);
            }
            result.add(row);
        }
        return result;
    }
}
