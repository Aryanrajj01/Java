class Solution {
    public boolean closeStrings(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(char c:a.toCharArray()){
            f1[c-'a']++;
        }
…        return Arrays.equals(f1,f2);
    }
}
