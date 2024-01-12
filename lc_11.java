class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length-1;
        int max = 0;
        while(l<r){
            int lh = h[l];
            int rh = h[r];
            int m_h = Math.min(lh,rh);
            int len = r-l;
            int c = m_h*len;
            max = Math.max(max,c);
            if(lh<rh){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
