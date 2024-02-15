class Solution {
    public long largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    long sum=0;
    for(long n:nums){
        sum+=n;
    }
    for(int i=nums.length-1;i>=2;i--){
        if(sum-nums[i]>nums[i]){
            return sum;
        }
        sum-=nums[i];
    }
    return -1;
    }
}
