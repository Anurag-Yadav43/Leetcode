class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);

        List<List<Integer>> merged = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(merged.isEmpty() || intervals[i][0]>merged.get(merged.size()-1).get(1)){
                merged.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }

            else{
                merged.get(merged.size()-1).set(1,Math.max(merged.get(merged.size()-1).get(1),intervals[i][1]));
            }
        }

        int[][] result = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            result[i][0] = merged.get(i).get(0);
            result[i][1] = merged.get(i).get(1);
        }

        return result;

    }
}