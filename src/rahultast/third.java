package rahultast;

import java.util.ArrayList;

public class third {

	public static void main(String[] args) {
		

		//compare same indexes of 2 different arrays and create another array for matching values 	
		
		
				int A[]= {1,2,3,4,5,6};
				int B[]= {2,3,6,5,10,8};
					ArrayList<Integer> b=new ArrayList<Integer>();	
				for (int j=0;j<A.length;j++) {
					
					if(A[j]==B[j]) {
						
					b.add(A[j]);
					}
					
				}
		Object c=	b.toArray();	
				
		for (int i=0;i<b.size();i++) {
			System.out.println(c);
		}

	}

}
