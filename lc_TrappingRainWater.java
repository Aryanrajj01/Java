class Solution {
    public int trap(int[] h) {
        int tw = 0;
        for(int i = 0;i<h.length;i++){
            int l = 0,r = 0;
            for(int j = i;j>=0;j--){
                l = Math.max(l,h[j]);
            }
            for(int j = i;j<h.length;j++){
                r = Math.max(r,h[j]);
            }
            tw +=Math.min(l,r)-h[i];
        }
        return tw;
    }
}
