class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        /*int b = 1;
        for(int i = 0;i<nums.length;i++){
            int a= 0 ;
            for(int j = 0 ;j<nums.length-1;j++){
                if(nums[i] != nums[j]){
                    i++;
                    j++;
                }
                else if(nums[i] == nums[j]){
                    b = i;
            }

            }
            
        }
        return b;*/
        for(int i = 0; i < nums.length; i++){
            if(nums[i + 1] == nums[i])
                return nums[i];
        }
        return -1;
    }
}
