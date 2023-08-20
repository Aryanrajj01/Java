import java.util.*;

class Solution {
    public int longestEqualSubarray(int[] v, int k) {
        int n = v.length;
        int i = 0;
        int j = 0;
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 1;
        int mf = 0;

        while (j < n) {
            m.put(v[j], m.getOrDefault(v[j], 0) + 1);
            mf = Math.max(mf, m.get(v[j]));

            int rem = j - i + 1 - mf;

            while (i < n && rem > k) {
                m.put(v[i], m.get(v[i]) - 1);
                i++;
                mf = Math.max(mf, m.get(v[j]));
                rem = j - i + 1 - mf;
            }

            ans = Math.max(ans, mf);
            j++;
        }

        return ans;
    }
}
