class Solution {
    public int firstMissingPositive(int[] nums) {
        /*Hashmap<Integer> a = new Hashmap<>();
        for(int i = 0;i<nums.length;i++){
            a.put(nums[i]);
        }
        for(int i = 1;i<=nums.length+1;i++){
            if(!a.contsinsKey(i)){
                return i;
            }
        }*/
        int a = 1;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == a){
                a++;
            }   
        }
        return a;
    }
    
}
