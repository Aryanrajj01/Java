class Solution {
    public int passThePillow(int n, int time) {
        int curr = 1;
        int d = 1;
        int ela = 0;
        while(ela<time){
            curr+=d;
            if(curr==n || curr==1){
                d=-d;
            }
            ela++;
        }
        return curr;
    }
}
