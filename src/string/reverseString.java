package string;

public class reverseString {

	public static void main(String[] args) {
		

		
		String s="selenium";
	String st="selenium with java automation123";
	String rev=" ";
	for (int i=st.length()-1;i>=0;i--) {
		
		rev=rev+st.charAt(i);
	}
	System.out.println("sting rev is : "+rev);
	
	
	removing_junk_from_string("@@bb@#automation12**&&0");
	
		
		//using sting buffer class which is synchronized so thread safe 
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
		//using string builder asyschronized so not thread safe but more effective 
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
		//reverser a integer
//		
//		int num=9867865;
//		int rev1=0;
//		while(num!= 0) {
//			rev1=rev1 * 10 + num % 10;
//			num=num/10;
//		}
//		int num1=987654321;
//		System.out.print(rev1);
////		StringBuffer	sb1=new StringBuffer(String.valueOf(num1)).reverse();
////		System.out.print("value :"+sb1);
		
		
		int x=123456789;
		String b=String.valueOf(x);
		StringBuffer sbx=new StringBuffer(String.valueOf(x));
		
		System.out.println("reversieee : "+sbx.reverse());
		
		
		//reversing a integer using a method
		
		reversingInteger(12345);
		
	}
	
	
	public static void removing_junk_from_string(String j) {
		
		
		j=j.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("using reg expressinon : "+j);
		
	}
	
	public static void reversingInteger(int  i) {
		
		int number =i;
		int rev=0;
		int reminder;
		while (number!=0) {
			
			reminder=number%10;
			rev=rev*10+reminder;
			number=number/10;
			
		}
		System.out.println("my reverse integer is : "+rev);
		
	}

}
