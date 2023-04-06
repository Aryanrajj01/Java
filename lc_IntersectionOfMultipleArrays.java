class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> a = new HashSet<Integer>();
    
       for (int i = 0; i < nums[0].length; i++) {
            a.add(nums[0][i]);

       }
        for (int i = 1; i < nums.length; i++) {

            HashSet<Integer> c = new HashSet<>();
                
                for (int j = 0; j < nums[i].length; j++) {
                
                    if (a.contains(nums[i][j])) {
                    c.add(nums[i][j]);
                }
            }
            a = c;
        }
        List<Integer> ans = new ArrayList<>(a);
        Collections.sort(ans);
        return ans;
    }
}
