package number;

public class reverseNumber {

	public static void main(String[] args) {
		

		
		int  num=1234567;
		int temp;
		int rev=0;
		
		while(num!=0) {
			
			temp=num%10;
			rev=temp+rev*10;
			num=num/10;
			
		}
		System.out.println("reversing number is : "+rev);
		
		
	}

}
