class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums.length -1;
        int b = nums.length-2;
        return (nums[a] -1) * (nums[b] -1);

    }
}
