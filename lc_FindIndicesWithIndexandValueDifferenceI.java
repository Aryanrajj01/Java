class Solution {
    public int[] findIndices(int[] nums, int in, int val) {
        int[] ans = {-1,-1};
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+in;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])>=val){
                    ans[0] = i;
                    ans[1] = j;
                    k=1;
                    break;
                }
            }
            if(k==1){
                break;
            }
        }
        return ans; 
    }
}
