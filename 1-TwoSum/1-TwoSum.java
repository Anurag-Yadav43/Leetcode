class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];

            if(hMap.containsKey(compliment)){
                return new int[]{hMap.get(compliment),i};
            }

            hMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}