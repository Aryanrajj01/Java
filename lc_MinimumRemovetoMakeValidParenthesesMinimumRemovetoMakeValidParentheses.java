class Solution {
    public String minRemoveToMakeValid(String s) {
    StringBuilder result = new StringBuilder();
    int balance = 0;
    for (char c : s.toCharArray()) {
        if (c == '(') {
            balance++;
            } else if (c == ')') {
                if (balance == 0) {
                    continue;
…                continue;
                }
            finalResult.append(c);
            }
        return finalResult.reverse().toString();
    }
}
