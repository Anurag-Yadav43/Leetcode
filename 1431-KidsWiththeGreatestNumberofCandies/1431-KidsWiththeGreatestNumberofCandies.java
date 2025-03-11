class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(candies[i] > maxi){
                maxi = candies[i];
            }
        }

        for(int i=0;i<n;i++){
            int chck = candies[i] + extraCandies;
            if(chck >= maxi){
                result.add(true);
            }
            else result.add(false);
        }

        return result;
    }
}