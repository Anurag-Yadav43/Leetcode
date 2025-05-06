// Last updated: 5/6/2025, 8:10:13 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int []arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}