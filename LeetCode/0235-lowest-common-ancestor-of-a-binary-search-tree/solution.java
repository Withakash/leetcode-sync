/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode first, TreeNode second) {
        
        if(root == null) return null;
         TreeNode curr = root;
      while(curr != null) {
        if(first.val < curr.val && second.val < curr.val) 
           curr = curr.left;
        else if(first.val > curr.val && second.val > curr.val) 
           curr = curr.right;
        else 
        return curr;
      }
      return null;
    }
}
