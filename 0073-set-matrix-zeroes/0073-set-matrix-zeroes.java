class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length ; 
        int n = matrix[0].length;

        boolean rowimpact = false;
        boolean colimpact = false;

        for(int col = 0 ; col <n ; col++){
            if(matrix[0][col]==0){
                rowimpact = true;
                break;
            }
        }
        for(int row = 0 ; row <m ; row++){
            if(matrix[row][0]==0){
                colimpact = true;
                break;
            }
        }
        for(int i = 1 ; i < m ; i++){
            for( int j = 1 ; j< n ; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for( int i = 1 ; i< m ; i++){
            for( int j = 1 ; j<n ; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(rowimpact){
            for( int col = 0 ; col<n ; col++){
                matrix[0][col]=0;
            }
        }
        if(colimpact){
            for( int row = 0 ; row<m ; row++){
                matrix[row][0]=0;
            }
        }
        
    }
}