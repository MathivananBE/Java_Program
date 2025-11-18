package matrix;

public class MatrixCheckSymmetric {

	public static void main(String[] args) {
		int[][] a = {
				{ 1, 2, 3 },
				{ 2, 5, 3 },
				{ 3, 3, 6 }
					};
		boolean IsSymmetric=true;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]!=a[j][i]) {
					IsSymmetric=false;
					break;
				}
			}
		}
		
		if(IsSymmetric) {
			System.out.println("Matrix is Symmetric");
		}else {
			System.out.println("Matrix Not is Symmetric");
		}
	}
}
