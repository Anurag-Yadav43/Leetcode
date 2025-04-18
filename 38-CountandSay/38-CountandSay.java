// Last updated: 4/18/2025, 10:56:55 PM
class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String say = countAndSay(n-1);

        String result = "";
        for(int i=0;i<say.length();i++){
            char ch = say.charAt(i);

            int count = 1;

            while(i<say.length()-1 && say.charAt(i) == say.charAt(i+1)){
                count++;
                i++;
            }
            result += String.valueOf(count) + ch;
        }

        return result;
    }
}