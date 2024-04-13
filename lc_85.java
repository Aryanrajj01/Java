class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int largest = 0;
        for (int i = 0; i < rows; i++) {
…                }
                int maxArea = 0;
                for (int i = 0; i < n; i++) {
                    maxArea = Math.max(maxArea, (right[i] - left[i] - 1) * heights[i]);
                    }
                return maxArea;
            }
        }
 
