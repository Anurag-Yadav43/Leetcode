// Last updated: 3/26/2025, 9:08:46 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index[]  = new int[2];
        int count =0;

        if(nums.length == 0){
            index[0] = -1;
            index[1] = -1;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                count++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                index[0] = i;
                index[1] = i+(count-1);
                break;
            }
            else{
                index[0] = -1;
                index[1] = -1;
            }
        }

        return index;
    }
}