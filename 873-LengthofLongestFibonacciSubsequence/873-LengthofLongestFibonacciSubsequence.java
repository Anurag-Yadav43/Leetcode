class Solution {

     private int fibChainLength(int[] arr, int a, int b, int n) {
        int fibIdx = Arrays.binarySearch(arr, a + b);
        if (fibIdx >= 0 && fibIdx < n) {
            return 1 + fibChainLength(arr, b, a + b, n);
        }
        return 0;
    }
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int longest = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int fibLen = fibChainLength(arr, a, b, n);
                if (fibLen > 0) longest = Math.max(longest, 2 + fibLen);
            }
        }
        return longest;
    }
}