class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;}
            int r;
            int sum = 0;
            int temp = x;
            while(x>0){
                r = x%10;
                sum = (sum*10)+r;
                x = x/10;
            }
            if(sum == temp){
                return true;}
                else{
                    return false;
                }
            }

            
        }
    
