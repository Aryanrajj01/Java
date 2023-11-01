class Solution {
        public int uniquePathsWithObstacles(int[][] og) {
        if(og[0][0]==1){
        return 0;
        }
        og[0][0]=1;
        int m = og.length;
        int n = og[0].length;
        for(int i = 1;i<m;i++){
        if(og[i][0] == 1){
…            
}
