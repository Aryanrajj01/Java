class Solution {
    public boolean checkStrings(String s1, String s2) {
    char[] ch1 = s1.toCharArray();
    char[] ch2 = s2.toCharArray();
    for(int i = 0;i<ch1.length;i++){
        if(ch1[i]!=ch2[i]){
        int j  = i+2;
        for(j = i+2;j<ch1.length;j+=2){
            if(ch1[j] == ch2[i]){
                break;
…    String s = new String(ch1);
    if(s.equals(s2)){
        return true;
    }
    return false;
    }
}
