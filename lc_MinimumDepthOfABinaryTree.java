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
    public int minDepth(TreeNode root) {
         if(root==null){
            return 0;
        }
        int l = minDepth(root.left);
        l++;
        int r = minDepth(root.right);
        r++;
        if(root.left==null){
            return r;
        }
        if(root.right==null){
            return l;
        }
        if(l<r){
            return l;
        }
        else{
            return r;
        }
    }
}
