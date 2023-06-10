class Solution {
        public char nextGreatestLetter(char[] let, char tar) {
        int ans=0;
        int l=0;
        int r=let.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(let[mid]>tar){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return let[ans];
    }
}
