class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeating = 0, missing = 0;
        int n = grid.length;
        int[] freq = new int[n * n + 1]; // Array to track occurrences of numbers

        // Count occurrences of each number
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                freq[grid[i][j]]++;
            }
        }

        // Find the missing and repeating numbers
        for (int i = 1; i <= n * n; i++) {
            if (freq[i] == 2) {
                repeating = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeating, missing}; // Return an int array instead of List
    }
}
