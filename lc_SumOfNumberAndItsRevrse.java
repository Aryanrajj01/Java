class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0;i<=num;i++){
            int temp = 0;
            int n = i;
            while(n!=0){
                temp = temp *10 + n%10;
                n = n/10;
            }
            if(temp +i == num){
                return true;
            }
        }
        return false;
    }
}
