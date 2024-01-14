class Solution {
    public int divide(int a, int b) {
        if(a==-2147483648 && b==-1) return 2147483647;
        int d = 0;
        d = a/b;
        return (d);
    }
}
