class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int ref=nums[2];
        int high=nums[nums.length-1]-ref;
        int ref2=nums[nums.length-3];
        int high2=ref2-nums[0];
        
        int high3=nums[nums.length-2]-nums[1];
        return Math.min(Math.min(high,high2),high3);
    }
}
