class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int isCol=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0)
                        matrix[0][j] = 0;
                    else
                        isCol = 0;
                }
            }
        }

        //check row
        for(int i=1;i<m;i++){
            if(matrix[i][0] == 0){
                for(int j=1;j<n;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //check col
        for(int j=1;j<n;j++){
            if(matrix[0][j] == 0){
                for(int i=1;i<m;i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j=1;j<n;j++){
                matrix[0][j] = 0;
            }
        }
        if(isCol == 0){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}