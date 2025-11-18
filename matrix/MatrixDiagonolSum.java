package matrix;

public class MatrixDiagonolSum {

	public static void main(String[] args) {
		int[][] a = {
				{ 1, 2, 10 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
					};
		
		int RightDiagonol=0;
		int LeftDiagonol=0;
		
		for(int i=0;i<a.length;i++) {
			RightDiagonol+=a[i][i];
			LeftDiagonol+=a[i][a.length-1-i];
			}
		
		System.out.println("Sum of RightDiagonol - "+RightDiagonol);
		System.out.println("Sum of LeftDiagonol - "+LeftDiagonol);
	}
}
