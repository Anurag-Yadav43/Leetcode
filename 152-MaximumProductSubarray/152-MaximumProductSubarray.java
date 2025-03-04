class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = nums[0]; // Store final max product
        int currMax = nums[0]; // Track max product at current position
        int currMin = nums[0]; // Track min product at current position

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) { // Swap if negative
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // Update current max and min product
            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            // Update global max product
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}
