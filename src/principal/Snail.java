package principal;

import java.util.ArrayList;
import java.util.List;

public class Snail {
	    
	    public static List<Integer> snailOrder(int[][] matrix) {
	        List<Integer> snailPath = new ArrayList<>();
	        if (matrix == null || matrix.length == 0) {
	            return snailPath;
	        }
	        
	        int rowStart = 0, rowEnd = matrix.length - 1;
	        int colStart = 0, colEnd = matrix[0].length - 1;
	        
	        while (rowStart <= rowEnd && colStart <= colEnd) {

	            for (int col = colStart; col <= colEnd; col++) {
	                snailPath.add(matrix[rowStart][col]);
	            }
	            rowStart++;
	            

	            for (int row = rowStart; row <= rowEnd; row++) {
	                snailPath.add(matrix[row][colEnd]);
	            }
	            colEnd--;
	            
	            if (rowStart <= rowEnd) {
	
	                for (int col = colEnd; col >= colStart; col--) {
	                    snailPath.add(matrix[rowEnd][col]);
	                }
	                rowEnd--;
	            }
	            
	            if (colStart <= colEnd) {

	                for (int row = rowEnd; row >= rowStart; row--) {
	                    snailPath.add(matrix[row][colStart]);
	                }
	                colStart++;
	            }
	        }
	        
	        return snailPath;
	    }
}