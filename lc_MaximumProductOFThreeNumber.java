class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums.length;
        int result = Integer.MIN_VALUE;
        result = Math.max(nums[0]*nums[1]*nums[a-1], nums[a-1]*nums[a-2]*nums[a-3]);
        return result;
    }
}
