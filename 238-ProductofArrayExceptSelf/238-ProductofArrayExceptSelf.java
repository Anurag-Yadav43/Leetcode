class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftOutput = new int[n];
        int[] rightOutput = new int[n];
        int[] output = new int[n];

        leftOutput[0] = 1;
        for(int i=1;i<n;i++){
            leftOutput[i] = leftOutput[i-1] * nums[i-1];
        }

        rightOutput[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            rightOutput[i] = rightOutput[i+1] * nums[i+1];
        }

        for(int i=0;i<n;i++){
            output[i] = leftOutput[i] * rightOutput[i];
        }

        return output;
    }
}