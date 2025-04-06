// Last updated: 4/6/2025, 1:51:40 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int orr = 0;
        for (int ele : nums) {
            orr |= ele;
        }
        return orr * (1 << (n - 1));
    }
}