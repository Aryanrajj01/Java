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
    int prev = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return res;
    }
    public  void inOrder(TreeNode root){
        if(root.left != null){
            inOrder(root.left);
        }
        res = Math.min(res, Math.abs(root.val - prev));
        prev = root.val;
        if(root.right != null)
            inOrder(root.right);
    }
}
