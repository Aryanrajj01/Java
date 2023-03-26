class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int j : nums){
            if(j<p){
                ans[i] = j;
                i++;
            }
        }
        for(int j:nums){
            if(j==p){
                ans[i] = j;
                i++;
            }
        }
        for(int j:nums){
            if(j>p){
                ans[i] = j;
                i++;
            }
        }
        return ans;
    }
}
