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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root.left);
        que.add(root.right);

        while(!que.isEmpty()) {
            TreeNode first = que.poll();
            TreeNode second = que.poll();

            if(first == null && second == null) continue;
            if(first == null || second == null) return false;
            if(first.val != second.val)  return false;

            que.add(first.left);
            que.add(second.right);
            que.add(first.right);
            que.add(second.left);       
        }

        return true;
    }
}
