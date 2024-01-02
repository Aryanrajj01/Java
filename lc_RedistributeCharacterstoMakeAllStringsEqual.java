class Solution {
    public boolean makeEqual(String[] a) {
        int[] c=new int[26];
        for(String s : a){
            for(int i=0;i<s.length();i++){
                c[s.charAt(i)-'a']++;
            }
        }
        for(int num : c){
            if(num%a.length!=0){
                return false;
            }
        }
        return true;
    }
}
