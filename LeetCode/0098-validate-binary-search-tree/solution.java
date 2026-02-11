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
    ArrayList<Integer> al = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        // System.out.println(al);
        int prev,curr;
        for(int i =1 ; i < al.size() ; i++) {
            prev = al.get(i-1);
            curr = al.get(i);
            
            if(prev >= curr ) return false;
        }

        return true;
    }

    void inorder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}
