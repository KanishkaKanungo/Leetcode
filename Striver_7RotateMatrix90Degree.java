import java.util.Arrays;
public class Striver_7RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix1 = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix1[i][j] = matrix[matrix.length-1-j][i];
            }
        }
        for(int k=0;k<matrix.length;k++){
            matrix[k] = matrix1[k];
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}