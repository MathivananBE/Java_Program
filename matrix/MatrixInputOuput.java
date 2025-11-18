package matrix;

import java.util.Scanner;

public class MatrixInputOuput {

	public static void main(String[] args) {
		int row=3,col=3;
		int[][] matrix = new int[row][col];
				
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		//print o/p
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
