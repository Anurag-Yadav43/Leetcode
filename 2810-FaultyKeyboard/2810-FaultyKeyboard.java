// Last updated: 4/21/2025, 12:40:21 AM
class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch != 'i'){
                ans.append(ch);            
            }
            else{
                ans.reverse();
            }
        }

        return ans.toString();
    }
}