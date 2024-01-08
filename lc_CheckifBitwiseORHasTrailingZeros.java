class Solution {
    public boolean hasTrailingZeros(int[] a) {
        int c=0;
        for(int i : a){
            if(i%2==0){
                c++;
            }
            if(c==2){
                return true;
            }
        }
        return false;
    }
}
