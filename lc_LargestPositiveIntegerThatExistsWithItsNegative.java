class Solution {
    public int findMaxK(int[] nums) {
    int maxK = -1;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (num > 0 && set.contains(-num)) {
            maxK = Math.max(maxK, num);
        } else if (num < 0 && set.contains(-num)) {
            maxK = Math.max(maxK, -num);
        }
        set.add(num);
    }
    return maxK;
    }
}
