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
…            pre=node;
            inorder(node.right);
        }
        public void swap(TreeNode root1,TreeNode root2){
            int temp = root1.val;
            root1.val = root2.val;
            root2.val = temp;
        }
    }
