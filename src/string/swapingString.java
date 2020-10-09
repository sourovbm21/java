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
		
		String sel="selenium";
		String aut="automation";
		
		System.out.println("before swaping sel : "+sel);
		System.out.println("before swaping aut: "+aut);
		
		//sel=sel.concat(aut);
		sel=sel+aut;;//seleniumautomation
		System.out.println("sel length is : "+sel.length());
		aut=sel.substring(0,sel.length()-aut.length());// selenium 18-10=8
		sel=sel.substring(aut.length());
		
		
		
		System.out.println("after  swaping sel : "+sel);
		System.out.println("after swaping aut: "+aut);
		
				
		stringSwaping("power","nap" );
	
	}
	

	
	public static void stringSwaping(String p,String q ) {
		
		
		System.out.println("before  swaping power : "+p);
		System.out.println("before swaping nap: "+q);
		p=p.concat(q);
		q=p.substring(0,p.length()-q.length());
		p=p.substring(q.length());
		System.out.println("after  swaping power : "+p);
		System.out.println("after swaping nap: "+q);
		
	}

}
