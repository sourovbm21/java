package string;

public class practise {

	
	public static void main(String []args) {

		
	//find total number of character of the given string 
	String s1="madam";
	String s2=" ";
	
	
	for (int i=0;i<s1.length();i++) {
		s2=s2+s1.charAt(i);
		
	}
	System.out.println(s2);
	if (s1.equalsIgnoreCase(s2)) {
		System.out.println("both are angram");
		
	}else
		System.out.println("both are not angram");
	

}

	
}