class Solution {
    public long maximumTripletValue(int[] a) {
    long ans=0;
    for(int i=0;i<a.length-2;i++){
        for(int j=i+1;j<a.length-1;j++){
            if(a[j]>=a[i]){
                continue;
                }
            for(int k=j+1;k<a.length;k++){
                if((long)(a[i] - a[j]) * a[k]>ans){
                    ans=(long)(a[i] - a[j]) * a[k];
                        }
                    }
                }
            }
        if(ans<0){
            return 0;
            }
        return ans;
    }
}
