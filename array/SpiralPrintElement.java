package array;

/*
 	input: 10 20 30 40 50
 		   72 90 17 80 32
 		   35 93 23 19 92
 		   53 16 28 53 21
 		   29 10 64 13 82
 		   
 	output:10 20 30 40 50 32 92 21 82 13 64 10 29 53 35 72 90 17 80 19 53 29 16 93 23  	
 */
public class SpiralPrintElement {

	public static void main(String[] args) {
		int [][] a= {
				{10,20,30,40,50},
				{72,90,17,80,32},
				{35,93,23,19,92},
				{53,16,29,53,21},
				{29,10,64,13,82}
				};
		
		int left=0,right=a[0].length-1,top=0,bottom=a.length-1;
		//System.out.println(left+" "+right+" "+top+" "+bottom);
		
		while(left<=right && top<=bottom) {
			//left to right
			for(int i=left;i<=right;i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			
			//Top to Bottom
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			
			//Right to Left
			for(int i=right;i>=left;i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			
			//bottom to top
			for(int i=bottom;i>=top;i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
}
