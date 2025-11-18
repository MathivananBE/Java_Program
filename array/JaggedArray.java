package array;

/*input : 10 20 30
		  23 12
		  90 76 56 18
		  2
 ouput: 30 20 10
 		12 23
 		18 56 76 90
 		2
 */
public class JaggedArray {
	public static void main(String[] args) {
		//Static way to create Multi-Dimensional Array
		int [][] a= {
					{10,20,30},
					{23,12},
					{90,76,56,18},
					{2}
					};
		
		//Dynamic way to create Multi-Dimensional Array
		int [][] b=new int[a.length][];
		for(int i=0;i<a.length;i++) {
			b[i]=new int[a[i].length];//create a row(array) for each colomn
		}
		
		//store and read
		for(int i=0;i<a.length;i++) {
			for(int j=a[i].length-1,m=0;j>=0;j--,m++) {
				b[i][m]=a[i][j];
			}
		}
		
		
		//read a Jagged Array or Multi-Dimensional Array
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
