class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n<1){
            return false;
        }
        while(n>1){
            if(n%3!=0){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}
