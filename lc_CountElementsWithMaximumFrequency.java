class Solution {
    public int maxFrequencyElements(int[] a) {
        int[] f=new int[101];
        int max=0;
        for(int i : a){
            f[i]++;
            if(f[i]>max){
                max=f[i];
            }
        }
        int ans=0;
        for(int i : f){
            if(i==max){
                ans+=i;
            }
        }
        return ans;
    }
}
