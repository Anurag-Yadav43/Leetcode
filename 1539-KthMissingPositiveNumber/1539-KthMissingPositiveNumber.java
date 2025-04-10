// Last updated: 4/10/2025, 6:43:00 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n= arr.length;
        int l =0, r = n-1;

        while(l <= r){
            int mid = l  + (r-l)/2;

            int kitne_missing_till_mid = arr[mid] - (mid+1);

            if(kitne_missing_till_mid < k){
                l = mid +1;

            }
            else{
                r = mid -1;
            }

        }

        return l+k;
    }
}