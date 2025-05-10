// Last updated: 5/10/2025, 4:07:47 PM
class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR = XOR ^ nums[i];
        }

        return XOR;
    }
}