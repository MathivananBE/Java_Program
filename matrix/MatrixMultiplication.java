package matrix;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		int [][] a= {
				{1,3,4},
				{3,2,1}
		};
		
		int [][] b= {
				{1,3},
				{5,2},
				{4,2}
		};
		
		int res[][] =new int[2][2];
		
		for(int i=0;i<a.length;i++) {            //a first row
			
			for(int j=0;j<b[0].length;j++) {			//b first column	
				
				res[i][j]=0;
				for(int k=0;k<3;k++) {				
					
					//System.out.println(i+""+k+" * "+k+""+j+" "+a[i][k]*b[k][j]);	
					res[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		//print output
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
