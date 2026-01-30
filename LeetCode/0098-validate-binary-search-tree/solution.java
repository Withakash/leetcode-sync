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

    List<Integer> res = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        long prev = Long.MIN_VALUE;
        for(int x: res) {
           if(prev >= x) return false;

           prev = x;
        }

        return true;
    }

    List<Integer> inorder(TreeNode root) {
        if(root == null) return res;

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);

        return res;
    }
}
