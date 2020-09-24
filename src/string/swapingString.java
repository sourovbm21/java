package string;

public class swapingString {

	public static void main(String[] args) {
		
	String s="sourov";
	String r="rahman";
	System.out.println(" @@@@@@@@@@@@@@@@@ ");
	System.out.println("before swaping s: "+s);
		System.out.println("before swaping s : "+r);
		
		s=s+r;
		
		r=s.substring(0,s.length()-r.length());
		s=s.substring(r.length());
	
		System.out.println(s);
		System.out.println(r);
		System.out.println("after swaping s: "+s);
		System.out.println("after  swaping r: "+r);
		
	
	}

}
