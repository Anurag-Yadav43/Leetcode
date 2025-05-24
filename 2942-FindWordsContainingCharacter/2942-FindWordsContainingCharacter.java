// Last updated: 5/24/2025, 11:09:59 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str = words[i];
            for(char ch: str.toCharArray()){
                if(ch == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}