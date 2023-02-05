class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        String s1 = null;
        String s2 = null;
        for(int i = 0;i<w1.length;i++){
            s1 += w1[i];
        }
            for(int j = 0;j<w2.length;j++){
                
                s2 += w2[j];
            }
                if(s1.equals(s2)){
                    return true;
                }
               
