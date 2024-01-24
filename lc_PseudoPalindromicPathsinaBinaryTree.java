class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, new int[10]);
    }

    private int dfs(TreeNode node, int[] freq) {
        if (node == null) {
            return 0;
        }

        freq[node.val]++;

        if (node.left == null && node.right == null) {
            int oddCount = 0;
            for (int f : freq) {
                if (f % 2 != 0) {
                    oddCount++;
                }
            }
            if (oddCount <= 1) {
                return 1;
            } else {
                return 0;
            }
        }

        int leftPaths = dfs(node.left, freq.clone());
        int rightPaths = dfs(node.right, freq.clone());

        return leftPaths + rightPaths;
    }
}
