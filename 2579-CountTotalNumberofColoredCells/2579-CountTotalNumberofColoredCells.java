class Solution {
    public long coloredCells(int n) {
        //return 1 + 4 * ((long) n * (n - 1) / 2); solutin here

        //another solution
         long count = 1;
        long jumpSize = 4;
        while (n > 1) {
            count += jumpSize;
            jumpSize += 4;
            n--;
        }
        return count;
    }
}