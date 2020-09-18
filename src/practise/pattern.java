package practise;

public class pattern {

	public static void main(String[] args) {
	
   /*
    * *
    * * *
    * * * */
		trianglePattern();
		leftTrianglePattern();
		pyramidPattern();
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void pyramidPattern() {
		
		
		
		
	}

	private static void leftTrianglePattern() {
		
		for (int i=0;i<4;i++) {
			
			for (int j=i-1*2;j>=0;j--) {
				System.out.print("x");
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

	private static void trianglePattern() {
for (int r=0;r<4;r++) {
			
			for (int c=0;c<=r;c++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
