class Solution {
    public int buyChoco(int[] p, int m) {
        int a=m;
        Arrays.sort(p);
        for(int i=0;i<2;i++){
            m = m-p[i];
        }
        if(m<0){
            return a;
        }
        return m;
    }
}
