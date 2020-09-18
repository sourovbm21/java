package javapractise;

public class nastedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(" .....outerloop start.....");
//first task
		/*1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
	
		int k=1;
		for (int i=0;i<4;i++) {
			//System.out.println("i am in outerloop going inner");
			//System.out.println(i);
			
			
			for (int j=1;j<=4-i;j++) {
				//System.out.println("i am in innerloop");
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
		}
		
//second tast 
		/*1 
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */

	System.out.println("I AM IN SECOND TEST");	
	int g=1;
		for (int row =1;row <5;row ++) {
			
			for (int col=1;col<=row;col++ ) {
				System.out.print(g);
				System.out.print("\t");
				g++;
			}
			System.out.println();
		}
		
//third test 
		/*1
		 *1 2 
		 *1 2 3
		 *1 2 3 4
		 */
		System.out.println("i am in third test");
		
	//	int h=1;
	for (int p=1;p<5;p++) {
		
		for (int q=1;q<=p;q++) {
			System.out.print(q);
			
		System.out.print("\t");
			//h++;
		}
		System.out.println();
	}
		
	/*3 
	 * 6 9
	 * 12 15 18 
	 */
System.out.println("my 4th test");	

int v=3;
for (int t=0;t<3;t++) {
	
	for (int co=0;co<=t;co++) {
		System.out.print(v);
		System.out.print("\t");
		v++;
	}
	System.out.println();
}
		
	}

}
