// Last updated: 4/19/2025, 11:01:12 AM
class Solution {
    public String largestOddNumber(String num) {
         for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) { // Check if odd
                return num.substring(0, i + 1);  // Return largest odd substring
            }
        }
        return "";
    }
}