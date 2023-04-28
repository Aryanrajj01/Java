class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int b) {
         List<Boolean> ans = new ArrayList<Boolean>();
        int m=0;
        for(int i =0;i<c.length;i++){
            m=Math.max(m,c[i]);
        }
        for(int i =0;i<c.length;i++){
            if(c[i]+b>=m){
                ans.add(true);
            }
            else{
            ans.add(false);
            }
        }
        return ans;
    }
}
