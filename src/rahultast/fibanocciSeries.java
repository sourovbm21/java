package rahultast;

public class fibanocciSeries {

	public static void main(String[] args) {
		// print fibanocci series
		//0,1 ,2,3,5,8,13,21,34
		int sum=fibanocci();
		
// check given number is prime	
		//7%2=0
		
		primeNumber();
		
	}

	private static void primeNumber() {
		
		boolean flag =false ;
		int prime =15;
		
		for(int i=2;i<prime/2;i++) {
			
			if(prime%i==0) {
				
				flag=true;
				break;
			}
		}
		 
		if(flag) {
			System.out.println(prime +" i am not a prime");
		}else
		{
			System.out.println(prime +" i am  a prime");
		}
		
	}

	private static int fibanocci() {
		int a=0;
		int b=1;
	     int i=1;
	     int sum=0;
		while ( i<9)
		{
			
			sum=a+b;
			System.out.println("fibanocci : "+sum);
			a=b;
			b=sum;
			i++;
		}
		return sum;
	}

	
	
	
}
