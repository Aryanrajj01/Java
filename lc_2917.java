class Solution {
    public int findKOr(int[] a, int k) {
        int bit=1;
        int ans=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int n : a){
                if((bit & n) > 0){
                    c++;
                }
            }
            if(c>=k){
                ans=ans|bit;
            }
            bit<<=1;
        }
        return ans;
    }
}
