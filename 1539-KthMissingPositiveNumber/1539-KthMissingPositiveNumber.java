// Last updated: 4/10/2025, 6:13:27 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num =1;
        int n = arr.length;
        int i = 0;
        while(i < n && k > 0){
            if(arr[i] == num){
                i++;
            }
            else{
                k--;
            }

            num++;

        }
        while(k > 0){
            k--;
            num++;
        }

        return num-1;
    }
}