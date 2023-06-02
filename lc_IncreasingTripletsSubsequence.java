class Solution {
    public boolean increasingTriplet(int[] nums) {
        /*int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i]<nums[j] && nums[j]<nums[k]){
                        return true;
                    }
                }
            }
        }
        return false;
        */
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= f) {
                f = num;
            } else if (num <= s) {
                s = num;
            } else {
                return true;
            }
        }
        
        return false;
    }
}
