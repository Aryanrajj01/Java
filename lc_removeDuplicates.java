class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[n] = nums[i];
                n = n+1;
            }
        }
        return n;

    }
}     
