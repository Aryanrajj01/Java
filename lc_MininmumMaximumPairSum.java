class Solution {
    public int minPairSum(int[] nums) {
        int result = 0;
        int sum = 0;
        Arrays.sort(nums);
        int i = 0,j = nums.length-1;
        while(i<j){
            sum = nums[i]+nums[j];
            result=Math.max(result,sum);
            i++;
            j--;
        }
        return result;
    }
}
