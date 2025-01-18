class Solution {
    public int minCost(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // Min-Heap: {cost, x, y}
        minHeap.offer(new int[]{0, 0, 0}); // cost, x, y

        int[] dx = {0, 0, 1, -1}; // RLDU
        int[] dy = {1, -1, 0, 0};

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int cost = curr[0], x = curr[1], y = curr[2];

            if (visited[x][y]) // Already Processed
                continue;

            if (x == m - 1 && y == n - 1) // Reached Destination
                return cost;

            visited[x][y] = true;

            for (int i = 0; i < 4; ++i) { // RLDU
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (isValid(newX, newY, m, n) && !visited[newX][newY]) {
                    int newCost = cost + ((i + 1) == grid[x][y] ? 0 : 1);
                    minHeap.offer(new int[]{newCost, newX, newY});
                }
            }
        }

        return 0;
    }

    private boolean isValid(int x, int y, int m, int n) {
        return (x >= 0 && x < m && y >= 0 && y < n);
    }
}