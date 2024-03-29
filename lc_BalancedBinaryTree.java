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
    public boolean isBalanced(TreeNode root) {
        if(search(root)==-1)
            return false;
        return true;
    }
    public int search(TreeNode root){
        if(root==null)
            return 0;
        int l=search(root.left);
        int r=search(root.right);
        if(l==-1 || r==-1)
            return -1;
        else if(Math.abs(l-r)>1)
            return -1;
        else
            return 1+Math.max(l,r);
    }
}
