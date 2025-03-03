class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];
        
        int left = 0, right = n - 1;
        int leftRes = 0, rightRes = n - 1;
        
        while (left < n) {
            if (nums[left] < pivot) {
                res[leftRes++] = nums[left];
            }
            if (nums[right] > pivot) {
                res[rightRes--] = nums[right];
            }
            left++;
            right--;
        }
        
        while (leftRes <= rightRes) {
            res[leftRes++] = pivot;
        }
        
        return res;
    }
}