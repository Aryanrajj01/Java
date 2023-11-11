class Solution {
    public int findChampion(int[][] a) {
        int count=0;
        int idx=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){
                    c++;
                }
            }
            if(c>count){
                count=c;
                idx=i;
            }
        }
        return idx;
    }
}
