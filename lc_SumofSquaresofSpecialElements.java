class Solution {
    public int sumOfSquares(int[] a) {
        return fun(a,0);
    }
    public int fun(int[] a,int i){
        if(i==a.length){
            return 0;
        }
        if(a.length%(i+1)==0){
            return (a[i]*a[i])+fun(a,i+1);
        }
        else{
            return 0+fun(a,i+1);
            }
    }
}
