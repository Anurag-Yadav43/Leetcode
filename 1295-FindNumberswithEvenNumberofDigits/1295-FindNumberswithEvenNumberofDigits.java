// Last updated: 4/30/2025, 6:44:33 PM
class Solution {
    public int findNumbers(int[] nums) {
        int op = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = String.valueOf(nums[i]).length();
            if (count % 2 == 0) {
                op++;
            }
        }
        return op;
    }
}