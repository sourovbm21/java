package javapractise;

public class practiseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=" HeLlO";
		System.out.println(a);
	System.out.println(	a.charAt(0));
	System.out.println(	a.charAt(1));
	System.out.println(	a.charAt(2));
	System.out.println(	a.charAt(3));
	System.out.println(	a.charAt(4));
	System.out.println("printing substring : "+a.substring(2));
	System.out.println("printing substring with start and ending : "+a.substring(2, 4));
	System.out.println(a.concat(" i am learning"));
	System.out.println(a.trim());
	System.out.println(a.length());
			System.out.println();
			String array[]=a.split("L");
		System.out.println(array[0]);
		System.out.println(array[1]);	;
		System.out.println(array[0]+array[1]);
	String newstring=	a.replace("L", "NOP");
	System.out.println("new string is :"+newstring);

	//printstring in reverse(palindome)
	//redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.
	//String p="sourov";
	String P=new String("kayak");
	String rev="";
	System.out.println(P); 
	
	for (int i=P.length()-1;i>=0;i=i-1) {
		rev=rev+P.charAt(i);;
	}
	System.out.println(rev); 
	if (P.contentEquals(rev)) {
		System.out.println("i am palindome");
	}
	else {
		System.out.println("i am not in palindome");
	}
	P.contentEquals(rev);
	
	System.out.println(rev); 
	if (P.contains(rev)) {
		System.out.println("i am palindome : 2");
	}
	else {
		System.out.println("i am not in palindome : 2");
	}
	

	}

}
