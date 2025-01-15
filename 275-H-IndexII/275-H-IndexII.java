class Solution {
    public int hIndex(int[] citations) {
        int l = 0;
        int n = citations.length;
        int h = citations.length-1;
        int result = 0;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            if(citations[mid]>=(n-mid)){
                result = n - mid;
                h -= 1;
            }else{
                l +=1;
            }
        }
        return result;
    }
}