package matrix;

public class Rotate90Degree {

	public static void main(String[] args) {
		int[][] a = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
					};

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[0].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {

			int left = 0, right = a[0].length - 1;
			while (left < right) {
				int temp = a[i][left];
				a[i][left] = a[i][right];
				a[i][right] = temp;
				left++;
				right--;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
