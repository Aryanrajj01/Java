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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        binarytree(root,a);
        return a;

    }
    public static void binarytree(TreeNode root,List<Integer> a){
        if(root==null){
            return;
        }
        
        binarytree(root.left,a);
        a.add(root.val);
        binarytree(root.right,a);
    }
}
