package matrix;

public class ZigzagTraversal {
	
	public static void main(String[] args) {
		
		int [][] a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int rows=a.length;
		int column=a[0].length;
		
		for(int i=0;i<rows;i++) {
			if(i%2==0) {
				for(int j=0;j<column;j++) {
					System.out.print(a[i][j]+" ");
				}
			}else {
				for(int j=column-1;j>=0;j--) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}

}
