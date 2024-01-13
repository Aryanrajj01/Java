class Solution {
    public int minSteps(String s, String t) {
        int[] ss = new int[26];
        int[] tt = new int[26];
        int st = 0;
        for(char c: s.toCharArray()){
            ss[c-'a']++;
        }
        for(char c:t.toCharArray()){
            tt[c-'a']++;
        }
        for(int i = 0;i<26;i++){
            st+=Math.abs(ss[i] - tt[i]);
        }
        return st/2;
    }
}
