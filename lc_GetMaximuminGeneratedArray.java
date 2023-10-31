class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] arr = new int[n+1];
        arr[0] = 0;
…        }
        return ans;
    }
}
