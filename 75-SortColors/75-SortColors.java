// Last updated: 3/26/2025, 11:22:31 PM
class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length-1;

        while(white <= blue){
            if(nums[white] == 0){
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red++;
                white++;
            }
            else if(nums[white] == 1){
                white++;
            }
            else{
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }
}