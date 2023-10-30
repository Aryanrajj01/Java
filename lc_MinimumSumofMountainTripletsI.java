class Solution {
    public int minimumSum(int[] a) {
        int ans=Integer.MAX_VALUE;
        boolean b=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i] < a[j] && a[k] < a[j]){
                        b=true;
                        if(a[i]+a[j]+a[k]<ans){
                            ans=a[i]+a[j]+a[k];
                        }
                    }
                }
            }
        }
        if(b==false){
            return -1;
        }
        return ans;
    }
}
