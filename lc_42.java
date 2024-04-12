class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int lm = 0;
        int rm = 0;
        int l = 0;
        int r = n-1;
        int ans = 0;
        while(l<r){
            if(h[l]>lm){
                lm = Math.max(lm,h[l]);
            }
            if(h[r]>rm){
                rm = Math.max(rm,h[r]);
            }
            if(lm<rm){
                ans = ans+ lm-h[l];
                l++;
            }
            else{
                ans = ans+rm - h[r];
                r--;
            }
        }
        return ans;
    }
}
