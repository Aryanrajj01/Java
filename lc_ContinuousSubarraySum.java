class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1); 
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1]; 
        }
        for(int i=0;i<nums.length;i++)
        {
…            }
           return false;
    }
}
