class Solution {
    public int countAsterisks(String s) {
        int a = 0;
        int b = 0;

    for (final char c : s.toCharArray()) {
      if (c == '|')
        ++b;
      else if (c == '*' && b % 2 == 0)
        ++a;
    }

    return a;
    }
}
