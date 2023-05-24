class Solution {
    public int numJewelsInStones(String je, String s) {
        int a =0;
        for(int i =0;i<je.length();i++){
            for(int j=0;j<s.length();j++){
                if(je.charAt(i)==s.charAt(j)){
                    a++;
                }
            }
        }
        return a;
    }
}
