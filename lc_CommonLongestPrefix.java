class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0)
            return "";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        int a=0;
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            if(ch==last.charAt(i)){
                a++;
            }
            else
                break;
        }
        if(a==0)
            return "";
        return first.substring(0,a);
    }
}
