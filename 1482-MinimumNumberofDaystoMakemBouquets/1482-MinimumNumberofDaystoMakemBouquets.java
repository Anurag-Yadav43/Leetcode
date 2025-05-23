// Last updated: 4/10/2025, 4:41:21 PM
class Solution {

    public int[] findRange(int []bloomDay){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int val : bloomDay){
            min = Math.min(min,val);
            max = Math.max(max,val);
        }

        return new int[]{min,max};

    }

    public boolean isPossible(int minDay,int k,int m,int []bloomDay){
        int count = 0;
        int total =0;
        for(int num: bloomDay){
            if(num <= minDay){
                count++;
            }
            else{
                count =0;
            }
            if(count == k){
                total++;
                count = 0;
            }
            if(total  >= m){
                return true;
            }
        }

        return false;
    }


    public int minDays(int[] bloomDay, int m, int k) {
        int range[] = findRange(bloomDay);
        int start = range[0];
        int end = range[1];
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(isPossible(mid,k,m,bloomDay)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }

        return ans;
    }
}