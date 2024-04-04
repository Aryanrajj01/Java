class Solution {
    public int maxDepth(String s) {
        int co= 0;
        int mo=0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)== '('){
                co++;
            }
            else if(s.charAt(i)==')'){
                co--;
            }
            mo = Math.max(mo,co);
        }
        return mo;
    }
}
