class Solution {
    public boolean canConstruct(String s1, String s2) {
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(int i=0;i<s2.length();i++){
            a2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<a2.length;i++){
            if(a2[i]<a1[i]){
                return false;
            }
        }
        return true;
    }
}
