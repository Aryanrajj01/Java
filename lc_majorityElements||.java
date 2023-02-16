class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++){
            int c = 0;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c>=nums.length/3){
                if(!a.contains(nums[i])){
                    a.add(nums[i]);
                }
            }
        }
        return a;
    }
}
