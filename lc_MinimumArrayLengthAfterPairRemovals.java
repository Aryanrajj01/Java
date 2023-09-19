class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int i = 0;
        int n = nums.size();
        int ans = nums.size();
        int j = (n+1)/2;
        while(i<n && j<n){
            if(nums.get(i)<nums.get(j)){
                ans-=2;
            }
            i++;
            j++;
        }
        return ans;
    }
}
