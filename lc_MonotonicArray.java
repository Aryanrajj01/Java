class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<2){
            return true;
        }
        int d = 0;
        for(int i = 1;i<nums.length;i++){
           if(nums[i]>nums[i-1]){
               if(d==0){
                   d=1;
…        }
        return true;
    }
}
