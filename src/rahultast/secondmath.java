package rahultast;

public class secondmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print 5 multiplication table without using Multiply operator 
		
		
		int result=multiply(5,10);//50
	System.out.println(result);	
		
	}
	
	
	public static int multiply(int i,int j) {
		 int sum=0;
		int k=1;
		while(k<=j) {
			
			sum=sum+i;
			k++;
		}
		
		return sum;
	}

}
