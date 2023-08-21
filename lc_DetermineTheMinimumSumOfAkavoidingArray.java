class Solution {
    public int minimumSum(int n, int k) {
        int s=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=1;set.size()<n;i++){
            if(!set.contains(k-i)){
                s=s+i;
                set.add(i);
            }
        }
        return s;
    }
}
