class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = 0;
        for(int i = 0;i<left.length;i++){
            if(max<left[i]){
                max = left[i];
            }
        }
        for(int i = 0;i<right.length;i++){
            if(max<(n-right[i])){
                max = n-right[i];
            }
        }
        return max;
    }
}
