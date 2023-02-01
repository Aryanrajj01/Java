class Solution {
    public int addDigits(int nums) {
        /*int c = 0;
        int n = 0;
        int k = 0;
        if(nums == 0){
            return 0;
        }
        else if(nums>0){
            n = nums%10;
            c = c+n;
            k = k + nums%10;
        }*/
        return 1+(nums-1)%9;
    }
}
