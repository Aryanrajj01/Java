class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int minPrev = Integer.MAX_VALUE;
                
                if (col > 0) {
                    minPrev = Math.min(minPrev, matrix[row - 1][col - 1]);
                }
                
                minPrev = Math.min(minPrev, matrix[row - 1][col]);
                
                if (col < n - 1) {
                    minPrev = Math.min(minPrev, matrix[row - 1][col + 1]);
                }
                
                matrix[row][col] += minPrev;
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int num : matrix[n - 1]) {
            minSum = Math.min(minSum, num);
        }

        return minSum;
    }
}
