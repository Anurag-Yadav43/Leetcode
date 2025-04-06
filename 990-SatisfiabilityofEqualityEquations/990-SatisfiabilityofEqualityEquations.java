// Last updated: 4/6/2025, 3:14:37 PM
class Solution {
    private int[] parent;
    private int[] rank;

    private int find(int x){
        if(parent[x] == x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    private void union(int x, int y){
        int x_parent = find(x);
        int y_parent = find(y);

        if(rank[x_parent] > rank[y_parent]){
            parent[y_parent] = x_parent;
        }
        else if(rank[x_parent] < rank[y_parent]){
            parent[x_parent] = y_parent;
        }
        else{
            parent[y_parent] = x_parent;
            rank[x_parent]++;
        }
    }
    public boolean equationsPossible(String[] equations) {
        parent = new int[26];
        rank = new int[26];

        for(int i=0;i<26;i++){
            parent[i] = i;
            rank[i] = 1;
        }

        for(String s: equations){
            if(s.charAt(1) == '='){
                union(s.charAt(0)-'a',s.charAt(3)-'a');
            }
        }

        for(String s: equations){
            if(s.charAt(1) == '!'){
                if(find(s.charAt(0) - 'a') == find(s.charAt(3) - 'a')){
                    return false;
                }
            }
        }
        return true;
    }
}