class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        reverse(c);
        int i = 0;
        for( i = 0;i<c.length;i++){
            if(c[i]<i+1)
                return i;   
        }
        return i;
…        }
    
    }
}
