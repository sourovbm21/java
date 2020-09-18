package rahultast;

public class palindome {

	public static void main(String[] args) {
		
		
		//reverse the string 
		String s="sourov";
		String rev = " ";
		for (int i=5;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}

		System.out.println("rev string is : "+rev);
	}

}
