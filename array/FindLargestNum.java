package array;

/* input: 8 16 1 3
 		  5 2 7
 		  9 3 5 2
 		  
 	output: 16
 			7
 			9
 */
public class FindLargestNum {
	public static void main(String[] args) {
		int [][] a= {
					{8,16,1,3},
					{5,2,7},
					{9,3,5,2}
					};
		for(int i=0;i<a.length;i++) {
			System.out.println(largest(a[i]));
		}
	}
	public static int largest(int[] arr) {
		int largestNum=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largestNum<arr[i]) {
				largestNum=arr[i];
			}
		}
		return largestNum;
	}
}
