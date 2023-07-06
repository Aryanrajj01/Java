class Solution {
    public int uniquePaths(int m, int n) {
      int a=unique(m,n);
      return a;
    }

    public static int unique(int m,int n) {
        long ans=1;
        
        for (int x = n, y = 1; y < m; x++,y++) {
            ans =ans*x/y;
        }

        return (int) ans;
    }
}
