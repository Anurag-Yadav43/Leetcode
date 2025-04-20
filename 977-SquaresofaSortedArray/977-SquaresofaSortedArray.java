// Last updated: 4/21/2025, 12:58:46 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i] * nums[i];
        }

        Arrays.sort(res);

        return res;
    }
}