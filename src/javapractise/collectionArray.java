package javapractise;

public class collectionArray {

	public static void main(String[] args) {
		/*  print min number 1
		  1,3,4
		  5,6,7
		  8,9,10
		 */

		int abc[][]= {{3,2,100},{5,6,7},{0,9,10}};
		int max =abc[0][0];
		 
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (abc[i][j]>max) {
					max =abc[i][j];
				}
			}
		}
		System.out.println(max);
		
		
		
		
	}

}
