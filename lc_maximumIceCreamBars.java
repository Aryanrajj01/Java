class Solution {
    public int maxIceCream(int[] p, int c) {
        Arrays.sort(p);
        for(int i = 0;i<p.length;i++){
            if(c>=p[i]){
                c  = c-p[i];
            }
            else{
                return i;
            }
        }
        return p.length;
         
    }
}
