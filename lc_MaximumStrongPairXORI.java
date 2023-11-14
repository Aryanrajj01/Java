class Solution {
    public int maximumStrongPairXor(int[] a) {
        Arrays.sort(a);
        int ans=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(Math.abs(a[i]-a[j])>Math.min(a[i],a[j])){
                    break;
                }
                if((a[i]^a[j])>ans){
                    ans=a[i]^a[j];
                }
            }
        }
        return ans;
    }
}
