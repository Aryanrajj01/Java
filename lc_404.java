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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null ){
            return 0;
        }
        return isleft(root,false);
    }
    public int isleft(TreeNode root,boolean isleftchild){
        if(root.left == null && root.right == null){
            return (isleftchild)?root.val:0;
        }
        int sum = 0;
        if(root.left!=null){
            sum+=isleft(root.left,true);
        }
        if(root.right!=null){
            sum+=isleft(root.right,false);
        }
        return sum;
    }
}
