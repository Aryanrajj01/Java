class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans = 1;
        int l = 0;
        for(int r = 1,curr = nums[0]; r < nums.length; curr += nums[r++]){
            while((nums[r] & curr) != 0){
                    curr = curr - nums[l++];
                }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
