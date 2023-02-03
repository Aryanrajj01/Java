class Solution {
    public int maximumWealth(int[][] a) {
        int n = 0;
        for(int i = 0;i<a.length;i++){
            int b= 0 ;
            for(int j = 0;j<a[i].length;j++){
                b = b + a[i][j];
            }
            if(b>n){
                n = b;
            }
        }
        return n;
    }
}
