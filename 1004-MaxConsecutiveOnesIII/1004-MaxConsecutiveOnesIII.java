// Last updated: 4/8/2025, 2:34:50 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0, right=0,zeros =0;
        int maxValue = Integer.MIN_VALUE;

        while(right < nums.length){
            if(nums[right] == 0) zeros++;

            if(zeros > k){
                if(nums[left] == 0) zeros--;

                left++;
            }

            if(zeros <= k){
                int len = right - left +1;
                maxValue = Math.max(len, maxValue);
            }

            right++;
        }

        return maxValue;
    }
}