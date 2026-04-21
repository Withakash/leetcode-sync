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
    List<Integer> in = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);

        for(int i = 1 ; i < in.size(); i++){
           int prev = in.get(i-1);
           int curr = in.get(i);

           if(curr <=  prev)  return false;
        }
        return true;
    }

    void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        in.add(root.val);
        inorder(root.right);
    }
}
