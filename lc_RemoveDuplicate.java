class Solution {
    public int removeDuplicates(int[] nums) {
        int ref=nums[0];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ref){
                if(count<2){
                    count++;
                    nums[j]=ref;
                    j++;
                }
                else
                    count++;
            }
            else{
                ref=nums[i];
                count=1;
                nums[j]=ref;
                j++;
            }
        }
        return j;
    }
}
