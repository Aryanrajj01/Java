class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long a = 0;
        long i = 0;
        for(int n:nums){
            if(n == 0){
                
                a += ++i;
            }
            else{
                i=0;
            }
        }
        return a;
    }
}
