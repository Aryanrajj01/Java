class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int ref=nums[i+1]-nums[i];
            if(ref<min)
                min=ref;
        }
        return min;
    }
}
