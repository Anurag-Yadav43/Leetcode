class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArray = new int[m+n];
        int i=0, j=0, k=0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                mergedArray[k++] = nums1[i++];
            }
            else{
                mergedArray[k++] = nums2[j++];
            }
        }
        while(i<m)  mergedArray[k++] = nums1[i++];
        
        while(j<n) mergedArray[k++] = nums2[j++];

        for(int z=0;z<m+n;z++){
            nums1[z] = mergedArray[z];
        }
    }
}