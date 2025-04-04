// Last updated: 4/4/2025, 5:06:46 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length == 0) return 0;

        int maxLength = Integer.MIN_VALUE;
        int left =0, right =0, zeros = 0;
        while(right<nums.length){
            if(nums[right] == 0) zeros++;

            if(zeros > k){
                if(nums[left] == 0) zeros--;
                left++;
            }
            
            if(zeros <= k){
                int len = right - left + 1;
                maxLength = Math.max(maxLength , len);
            }

            right++;
        }

        return maxLength;
    }
}