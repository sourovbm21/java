package rahultast;

public class solving {

	public static void main(String[] args) {
		
		
	//create a method which accepts array and returns sum of all the elements in array
		
		int []a= {1,2,3,4,5};
		
		  int sum=sumArray(a);
		
		System.out.println("sum is : "+sum);
	
		
	
	}

	private static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		
		return sum;
	}

	
	
	
	
	
	
	
	

}
