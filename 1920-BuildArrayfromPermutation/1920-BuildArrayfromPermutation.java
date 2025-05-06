// Last updated: 5/6/2025, 9:01:12 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i] + n*(nums[nums[i]]%n);
        }
        for(int i=0;i<n;i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}