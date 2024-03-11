class Solution {
    public String customSortString(String order, String s) {
    StringBuilder result = new StringBuilder();
    int[] count = new int[26];
    for (char ch : s.toCharArray()) {
        count[ch - 'a']++;
        }
    for (char ch : order.toCharArray()) {
        while (count[ch - 'a']-- > 0) {
            result.append(ch);
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            while (count[ch - 'a']-- > 0) {
                result.append(ch);
                }
            }
        return result.toString();
    }
}
