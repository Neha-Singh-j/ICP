
import java.util.*;

public class Search_In_2D_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        int col=matrix[0].length-1;
        int row = 0;
        while (row < m && col>=0) {
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){ // peeche milega same row mai
                col--;;
            }else{
                row++; // next row milega
            }

        }
        return false;
    }

}
