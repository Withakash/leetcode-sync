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
class Solution {private Integer prev = null;

    public boolean isValidBST(TreeNode root) {

        // Base case: empty tree is a valid BST
        if (root == null)
            return true;

        // Check left subtree
        if (!isValidBST(root.left))
            return false;

        // Inorder condition: current value must be greater than previous
        if (prev != null && root.val <= prev)
            return false;

        // Update previous value
        prev = root.val;

        // Check right subtree
        return isValidBST(root.right);
    }
}
