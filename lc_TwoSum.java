class Solution {
    public int[] twoSum(int[] nums, int t) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == t - nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
