/*
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row
 * and column are set to 0
 */

package ZeroMatrix;

public class ZeroMatrix {
	public static void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
		System.out.print("started");
		
		// Check if first row has a zero
		for (int j = 0; j < matrix[0].length; j++) {
			System.out.print("check first row");
			if (matrix[0][j] == 0) {
				System.out.print("zero row");
				rowHasZero = true;
				break;
			}
		}
		
		// Check if first column has a zero
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("check first column");
			if (matrix[i][0] == 0) {
				System.out.print("zero column");
				colHasZero = true;
				break;
			}
		}
	
		// Check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				System.out.print("check rest of array");
				if (matrix[i][j] == 0) {
					System.out.print("i and j is 0");
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
	
		// Nullify rows based on values in first column
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				System.out.print("nullified column");
				nullifyRow(matrix, i);
			}
		}
	
		// Nullify columns based on values in first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				System.out.print("nullified row");
				nullifyColumn(matrix, j);
			}
		}
	
		// Nullify first row
		if (rowHasZero) {
			System.out.print("row nullified");
			nullifyRow(matrix, 0);
		}
	
		// Nullify first column
		if (colHasZero) {
			System.out.print("column nullified");
			nullifyColumn(matrix, 0);
		}		
	}
	
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}

	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
	
	public static void main(String[] args) {
		int matrix[][] = {
				{ 4, 1, 2, 1 },
				{ 1, 6, 9, 11 }
		};
		
		setZeros(matrix);
		
	}
}
	
