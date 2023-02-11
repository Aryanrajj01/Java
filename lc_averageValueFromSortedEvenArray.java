class Solution {
    public int averageValue(int[] nums) {
        int s = 0;
        int a = 0;
        for(int n : nums){
            if( n%2 ==0 && n%3 == 0){
                s = s+n;
                a = a+1;
            }
        }
        if(a>0){
            return s/a;
        }
        return 0 ;
    }
}
