class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a = 1;
        int b = 0;
        int[] result = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i]>=0){
                result[b] = nums[i];
                b = b+2;
            }
            else{
                result[a] = nums[i];
                a=a+2;
            }
        }
        return result;
    }
}
