class Solution {
    public int[] countBits(int n) {
        int[] ans = new int [n+1];
        for(int i=0; i<=n; i++){
            ans[i] = setBits(i);
        }
        return ans;
    }
    public int setBits(int a){
        int count=0;
        while(a!=0){
            count++;
            a = a-(a & -a);
        }
        return count;
    }
}
