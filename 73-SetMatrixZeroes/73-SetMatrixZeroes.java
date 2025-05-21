// Last updated: 5/22/2025, 1:05:32 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = matrix[i][j]; 
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    for(int k = 0;k<n;k++){
                        result[i][k] = 0; // zero out the entire row
                    }

                    for(int k = 0;k<m;k++){
                        result[k][j] = 0; // zero out the entire column
                    }
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = result[i][j]; 
            }
        }

    }
}