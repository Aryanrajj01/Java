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
…        if (node == null) {
            return curMax - curMin;
        }
        curMax = Math.max(curMax, node.val);
        curMin = Math.min(curMin, node.val);
        int ld = h(node.left, curMax, curMin);
        int rd = h(node.right, curMax, curMin);
        return Math.max(ld, rd);
    }
}
