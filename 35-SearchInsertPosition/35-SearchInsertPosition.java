// Last updated: 3/26/2025, 12:22:16 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        int left =0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target) return mid;

            if(nums[mid] > target){
                right = mid;
            }
            else{
                left = mid +1;
            }
        }

        return nums[left] < target ? left+1 : left;
    }
}