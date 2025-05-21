// Last updated: 5/22/2025, 1:19:56 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || column[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

/*
//brute force
    //Approch-1 (Using extra space of m*n)
    //T.C : O(m*n*(m+n))
    //S.C : O(m*n)
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
    

*/