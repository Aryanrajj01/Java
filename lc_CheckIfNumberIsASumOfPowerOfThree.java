class Solution {
    public boolean checkPowersOfThree(int n) {
        int d = 0;
        while(n!=0){
            d = n%3;
            if(d == 2){
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
