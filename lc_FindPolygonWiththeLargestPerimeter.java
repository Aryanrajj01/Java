class Solution {
    public long largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    for (int i = nums.length - 3; i >= 0; i--) {
        if (nums[i] + nums[i + 1] > nums[i + 2]) {
            return (long) nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
    return -1;
    }
}
