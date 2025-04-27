// Last updated: 4/28/2025, 1:36:27 AM
class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        
        for(int i=0;i<=nums.length-3;i++){
            int first = nums[i];
            int second = nums[i+1];
            int third = nums[i+2];

            if(first + third == second/2.0){
                count++;
            }
        }
        return count;
    }
}