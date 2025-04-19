// Last updated: 4/19/2025, 4:18:23 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
       if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false; // mismatch
                }
            } else {
                if (map.containsValue(t.charAt(i))) {
                    return false; // one-to-many mapping not allowed
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

}
    
