class Solution {
    public boolean isToeplitzMatrix(int[][] m) {
        int r = m.length;
        int c = m[0].length;
      for(int i =0;i<r-1;i++){
          for(int j= 0;j<c-1;j++){
              if(m[i][j]!=m[i+1][j+1]){
              return false;
          }
          }
      }
      return true;
    }
}
