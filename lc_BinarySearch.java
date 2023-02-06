class Solution {
    public int search(int[] nums, int t) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == t){
                return i;
            }
        }
        return -1;
    }
}
