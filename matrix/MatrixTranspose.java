package matrix;

public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int row=a.length;
		int col=a[0].length;
		int[][] TransposeMatrix=new int [row][col];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				TransposeMatrix[j][i]=a[i][j];
			}
		}
		
		//print
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(TransposeMatrix[i][j]+" ");
			}System.out.println();		
		}
		
	}
}
