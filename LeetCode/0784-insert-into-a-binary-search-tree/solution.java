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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       TreeNode new_node = new TreeNode(val);
       if(root == null) return new_node;
       TreeNode curr = root;
       while(curr != null) {
        if(val < curr.val && curr.left != null) 
            curr = curr.left;
        else if(val > curr.val && curr.right != null) 
            curr = curr.right;
        else break;
       }

       if(val < curr.val) curr.left = new_node;
       else curr.right = new_node;

       return root;
    }
}
