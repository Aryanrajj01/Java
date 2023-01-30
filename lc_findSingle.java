class Solution {
    public int singleNumber(int[] arr) {
        int b = 0;
        for (int a : arr) {
            b ^= a;
        }
        return b;
    }
}
