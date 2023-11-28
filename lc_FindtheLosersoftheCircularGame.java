class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] a=new int[n+1];
        int i=1;
        int curr=1;
        a[1]++;
        while(true){
            if(curr+i*k>n){
                curr = (curr + k * i - 1) % n + 1;
                if(a[curr]>0){
                    break;
                }
                else{
                    a[curr]++;
                }
            }
            else{
                if(a[curr+i*k]>0){
                    break;
                }
                else{
                    
                    curr=curr+i*k;
                    a[curr]++;
                }
            }
            i++;
        }
        int s=0;
        for(int j : a){
            if(j==0){
                s++;
            }
        }
        int idx=0;
        int[] ans=new int[s-1];
        System.out.println(Arrays.toString(a));
        for(int j=1;j<a.length;j++){
            if(a[j]==0){
                ans[idx++]=j;
            }
        }
        return ans;
    }
}
