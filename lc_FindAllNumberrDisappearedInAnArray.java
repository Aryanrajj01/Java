class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a = new HashSet<Integer>();
        for(int i:nums){
            a.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =1;i <= nums.length;i++){
            if(!a.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
