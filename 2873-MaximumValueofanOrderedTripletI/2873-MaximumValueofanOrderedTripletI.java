// Last updated: 4/3/2025, 12:59:14 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
         int n = nums.length;
        long result = 0;
        long maxDiff = 0;
        long maxi = 0;
        
        for (int k = 0; k < n; k++) {
            result = Math.max(result, maxDiff * nums[k]);
            maxDiff = Math.max(maxDiff, maxi - nums[k]);
            maxi = Math.max(maxi, nums[k]);
        }
        
        return result;
    }
}