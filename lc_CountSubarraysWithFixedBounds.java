class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int mini = -1;
        int maxi = -1;
        long ans = 0;
        int lb= -1;
        for(int c = 0;c<nums.length;c++){
            if(nums[c] == minK){
                mini = c;
            }
            if(nums[c] == maxK){
                maxi = c;
            }
            if(nums[c]<minK || nums[c]>maxK){
                lb = c;
            }
            if(maxi!=-1 && mini!=-1){
                int s = Math.min(maxi,mini);
                if((s-lb)>0){
                    ans += (s-lb);
                }
            }
        }
        return ans;
    }
}
