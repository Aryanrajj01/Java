class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int l = s.length();
        int count = 0;
        for(int i = 0;i<l/2;i++){
            char first = s.charAt(i);
            char second = s.charAt(l/2 + i);
            if(isVowel(first)){
                count++;
            }
            if(isVowel(second)){
                count--;
            }
        }

    
    return count==0;
    }
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
