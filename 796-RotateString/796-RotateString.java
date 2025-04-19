// Last updated: 4/19/2025, 5:22:05 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String doubled = s + s; // Concatenating s with itself
        return doubled.contains(goal);
    }
}