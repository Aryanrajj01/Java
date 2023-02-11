class Solution {
    public int reverse(int x) {
        int a = 0;
        int b =0;
        
        while(x!=0){
            a = a*10+x%10;
            if((a-x%10)/10 != b){
                return 0;
            }
            
            b = a;
            x = x/10;
            }
        return a;
    }
}
