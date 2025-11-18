package matrix;

public class MatrixAdd {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] b= {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		int row=a.length;
		int col=a[0].length;
		int[][] sum=new int [row][col];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		//print
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(sum[i][j]+" ");
			}System.out.println();		
		}
		
	}
	
}
