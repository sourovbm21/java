package rahultast;

public class practise {

	
	public static void main(String []args) {
		
		
		
		int [] a= {1,2,6,5,-10,6,9,8,-2};
		int sum=sumArray(a);//method accept an array and returns sum of that array
		System.out.println("the sum is : "+sum);
		
		    maxDifference(a);//find max differnce between any adjacent index in array
		multiplicationTable( 2);//multiplication table without using multiplication operator 
		
			
		
		
	}
	
	
	public static void maxDifference(int []a) {
		
	
		int diff=0;
		for (int i=0;i<a.length-1;i++) {
			
			int k=a[i+1] - a[i];
			System.out.println("difference between adjacent index : "+k);
			
			if (k>diff) {
				diff=a[i+1]-a[i];
				
			}
			//System.out.println("max difference is : "+diff);
		
		}
		System.out.println("max difference is : "+diff);
	}

	private static void multiplicationTable(int b) {
				
		int c=0;
		for (int i=1;i<=10;i++) {
			int d=b+c;
			c=d;
			System.out.println("the 5 multiplicaton is : "+b+"*"+i+" "+c);

		}
		System.out.println("the 5 multiplicaton is : "+c);
		
	}



	public static int sumArray(int[] a) {
		
		int sum=0;
		
		for (int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
		}
		
		return sum;
	}
	
	
	
	
}
