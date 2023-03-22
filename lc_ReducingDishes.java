class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int result = 0;
        for(int i = 0;i<s.length;i++){
            int ans = 0;
            int a = 1;
            for(int j = i;j<s.length;j++){
                ans +=s[j]*a;
                a++;
            }
            if(ans>result){
                result = ans;
            }
        }
        return result;
    }
}
