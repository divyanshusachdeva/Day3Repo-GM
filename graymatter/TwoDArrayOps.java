package com.graymatter;

public class TwoDArrayOps {

	
	public static void printMatrix(int[][] matrix3) {
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
	

	public static void add(int[][] matrix1, int[][] matrix2) {
	
		
		
	}
	
	
	public static void sub(int[][] matrix1, int[][] matrix2) {
	
		
		
	}
	
	
	public static void mul(int[][] matrix1, int[][] matrix2) {
	
		int[][] result = new int[matrix1.length][matrix2.length];
		
		for(int i = 0; i < matrix1.length ; i++)
		{
			for(int j = 0 ; j < matrix2.length ; j++)
			{
				for(int k = 0 ; k < matrix2.length ; k++)
				{
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		
		 for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result.length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
		
	}
	
	public static void main(String[] args) {

		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
        add(matrix1, matrix2);
        sub(matrix1, matrix2);
        mul(matrix1, matrix2);
        
	}

}
