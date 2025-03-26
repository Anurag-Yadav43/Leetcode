// Last updated: 3/27/2025, 12:57:50 AM
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int value = 0;
        int frequency = 0;

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) > frequency){
                value = num;
                frequency = map.get(num);
            }
        }

        return value;
    }
}