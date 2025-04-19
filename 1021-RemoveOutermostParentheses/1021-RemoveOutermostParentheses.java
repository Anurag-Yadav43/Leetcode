// Last updated: 4/19/2025, 10:51:16 AM
class Solution {
    public String removeOuterParentheses(String s) {
        int count =0;
        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == ')') count--;

            if(count>0) str.append(ch);

            if(ch == '(') count++;
        }

        return str.toString();
    }
}