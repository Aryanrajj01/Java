class Solution {
    public int numRescueBoats(int[] p, int w) {
        Arrays.sort(p);
        int ans=0;
        int l=0,r=p.length-1;
        while(l<=r){
            int sum=p[l]+p[r];
            if(sum>w){
                ans++;
                r--;
            }
            else{
                ans++;
                r--;
                l++;
            }
        }
        return ans;
    }
}
