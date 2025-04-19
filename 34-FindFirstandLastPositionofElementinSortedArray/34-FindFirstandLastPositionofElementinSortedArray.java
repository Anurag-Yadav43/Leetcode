// Last updated: 4/19/2025, 8:58:31 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []arr = new int[2];
        arr[0] = findFirst(nums,target);
        arr[1] = findLast(nums,target);

        return arr;
        
    }

    private int findFirst(int []nums,int target){
        int start = 0, end = nums.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                index = mid;
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int []nums,int target){
        int start = 0, end = nums.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                index = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
    }
}