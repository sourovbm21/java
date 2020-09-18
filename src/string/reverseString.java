package string;

public class reverseString {

	public static void main(String[] args) {
		

		
		String s="selenium";
		String rev="";
		
		for (int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//using sting buffer class
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
		//using string builder
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
		//reverser a integer
		
		int num=9867865;
		int rev1=0;
		while(num!= 0) {
			rev1=rev1 * 10 + num % 10;
			num=num/10;
		}
		int num1=987654321;
		System.out.print(rev1);
		StringBuffer	sb1=new StringBuffer(String.valueOf(num1)).reverse();
		System.out.print("value :"+sb1);
		
	}

}
