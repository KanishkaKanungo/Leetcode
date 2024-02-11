class Solution {
    public void setZeroes(int[][] matrix) {
         int[][] arr = new int[matrix.length][matrix[0].length];
         for(int m=0;m<matrix.length;m++){
             for(int n=0;n<matrix[m].length;n++){               
                     arr[m][n]=matrix[m][n];
             }
         }
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[i].length;j++){
                 if(matrix[i][j]==0){
                     for(int k=0;k<matrix[i].length;k++){
                         arr[i][k] = 0;
                     }
                     for(int l=0;l<matrix.length;l++){
                         arr[l][j] = 0;
                     }
                 }                
             }
         }

         for(int m=0;m<matrix.length;m++){
             for(int n=0;n<matrix[m].length;n++){
                 if(arr[m][n]==0){
                     matrix[m][n]=0;
                 }
             }
         }
    }
}