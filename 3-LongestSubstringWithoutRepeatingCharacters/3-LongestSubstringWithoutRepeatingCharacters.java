// Last updated: 4/4/2025, 3:44:51 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maxAns = Integer.MIN_VALUE;

        for(int i=0;i<=s.length()-1;i++){
            Set<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    
                    break;
                }
                set.add(s.charAt(j));
                maxAns = Math.max(maxAns,j-i+1);
            }
        }
        return maxAns;
    }
}