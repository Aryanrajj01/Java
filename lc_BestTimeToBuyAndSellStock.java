/*class Solution {
    public int maxProfit(int[] price) {
        int x = price.length;
        int n = 0;
        for(int i= 1;i<x;i++){
            if(price[i]>price[i-1]){
                n = n +(price[i]-price[i-1]);
            }
        }
        return n;
    }
}



class Solution {
    public int maxProfit(int[] a) {
        int m = 0;
        for(int i = 0;i<a.length-1;i++){
                for(int j = i+1;j<a.length;j++){
                    int p = a[j] - a[i];
                    if(p>m)
                    m = p;
                }
        }
        return m;
    }
}

*/

class Solution {
    public int maxProfit(int[] a) {
        int m = 0;
        int n = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]<n){
                n = a[i];
            }
            else if((a[i]-n)>m){
                m = a[i]-n;
            }
        }
        return m;
    }
}




