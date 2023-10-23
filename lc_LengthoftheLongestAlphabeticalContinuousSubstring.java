class Solution {
    public int longestContinuousSubstring(String s) {
        String str="abcdefghijklmnopqrstuvwxyz";
        int l=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(str.contains(s.substring(k,i+1)))
                l=Math.max(l,(s.substring(k,i+1)).length());
            else{
                k=i;
                i--;
            }
        }
        return l;
    }
}
