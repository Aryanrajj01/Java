class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0"; // If all digits need to be removed, return "0"

        StringBuilder result = new StringBuilder();
        int digitsToRemove = k;

        for (char digit : num.toCharArray()) {
            while (digitsToRemove > 0 && result.length() > 0 && result.charAt(result.length() - 1) > digit) {
                result.deleteCharAt(result.length() - 1); // Remove larger digits from result
                digitsToRemove--;
            }
            result.append(digit); // Append current digit to result
        }

        // If there are still digits to remove, remove them from the end of the result
        result.setLength(result.length() - digitsToRemove);

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
