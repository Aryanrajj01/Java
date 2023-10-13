public class Solution extends VersionControl { 
    public int firstBadVersion(int n) {

    int hi=n;
    int lo=1;
    int ans=0; 
    while(lo<=hi)
    {
        int mid=lo+(hi-lo)/2; 
        if(isBadVersion(mid)){ 
            ans=mid;
            hi=mid-1;
    }
     else{ lo=mid+1;
    }
    }
     return ans;
        }
}
