class Solution {
    public int maxSubArray(int[] nums) {
        int a = 0;
        int m = nums[0];
        for(int i = 0;i<nums.length;i++){
            
            if(a<0){
                a =0;
            }
            a = a + nums[i];
            m = Math.max(a,m);
        }
        return m;
    }
}
