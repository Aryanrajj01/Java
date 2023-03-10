class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int a = 1;
        int b = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1] +1){
                    b++;
                }
                else{
                    a = Math.max(a,b);
                    b = 1;
                }
            }
        }
        if(nums.length == 0){
            return 0;
        }
        return Math.max(a,b);
    }
}
