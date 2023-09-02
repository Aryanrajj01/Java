class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int curr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            curr[i] = nums[i];
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int x=0;
…        return y-x;
    }
}
