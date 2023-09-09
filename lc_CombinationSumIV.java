class Solution {
    public int combinationSum4(int[] nums, int t) {
        int a[] = new int[t+1];
        a[0]=1;
        for(int i = 1;i<=t;i++){
            for(int num:nums){
                if(num<=i){
                    a[i]+=a[i-num];
                }
            }
        }
        return a[t];
    }
}
