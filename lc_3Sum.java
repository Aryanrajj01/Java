class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
         List<List<Integer>>ans =new ArrayList<>();
         for(int i=0;i<nums.length-2;i++){
             for(int j=i+1;j<nums.length-1;j++){
                 for(int k=j+1;k<nums.length;k++){
                     if(nums[i]+nums[j]+nums[k]==0){
                       ans.add(Arrays.asList(nums[i], nums[j] ,nums[k]));
                     }
                 }
             }
         }
         return ans;
    }
}
