package javapractise;

public class multidimentionalArray {

	public static void main(String[] args) {
		
		/*2 4 5
		 * 3 4 7
		 * 1  2 9
		 */
        
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min =abc [0][0];
		int max=abc [0][1];
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
				
			}
			
		}
		System.out.println("min number is : "+min);
		
	
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				
				if(abc [i][j]>max) {
					max=abc[i][j];
				}
			}
		}
		System.out.println("max number is : "+max);
		
		
		
		
		
		
		
	}

}
