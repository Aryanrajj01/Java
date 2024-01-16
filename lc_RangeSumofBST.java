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
    public int rangeSumBST(TreeNode root, int l, int h) {
        return traverse(root,l,h);
    }
    public int traverse(TreeNode root,int l,int h){
        if(root==null){
            return 0;
        }
        if(root.val>=l && root.val<=h){
            return root.val+traverse(root.right,l,h)+traverse(root.left,l,h);
        }
        else{
            return 0+traverse(root.right,l,h)+traverse(root.left,l,h);
        }
    }
}
