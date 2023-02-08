class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        for(int i = 0;i<n2.length && m<n1.length ;i++){
            n1[m] = n2[i];
            m++;
        }
       Arrays.sort(n1);
    }
}
