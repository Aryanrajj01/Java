class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int ans=0;
        Set<Integer> se=new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            if(se.size()==k){
                break;
            }
            if(nums.get(i)<=k){
               se.add(nums.get(i));
               ans++;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
