class Solution {
    public int minimumSum(int n, int k) {
        int ans = 0;
        Set<Integer> se = new HashSet<>();
        int idx = 1;
        while(n-->0){
        if(se.contains(k-idx)){
        n++;
        }else{
           se.add(idx);
            ans+=idx;
        } 
            idx++;
        }
        return ans;
    }
}
