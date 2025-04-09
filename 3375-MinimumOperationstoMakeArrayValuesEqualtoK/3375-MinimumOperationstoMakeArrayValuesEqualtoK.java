// Last updated: 4/9/2025, 7:30:08 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (x < k) {
                return -1;
            } else if (x > k) {
                set.add(x);
            }
        }

        return set.size();
    }
}