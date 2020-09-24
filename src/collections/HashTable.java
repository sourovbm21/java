package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
	
		//it is similiar to hashmap but synchronize 
		//stores the value is basis of key value
		//key -->object-->Hashcode -->value
		//conains only unique value
		//no null key and null value are not allowed
		
		
		
		
		Hashtable<Integer,String > h1=new Hashtable <Integer,String >();
		
		h1.put(1, "maliha");
		h1.put(2, "myrah");
		h1.put(3, "sourov");
		
		
		Hashtable <Integer,String >h2=new Hashtable<Integer,String > ();
		
	h2=	(Hashtable) h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		h2.clear();
		
		System.out.println(h1);
		System.out.println(h2);
		
		Hashtable <String ,String >st=new Hashtable <>();
		
		
		st.put("A", "sourov");
		st.put("B","automation");
		st.put("C", "enginer ");
		System.out.println(st);
		
	//elumeration 
		
	Enumeration e =	st.elements();
	
	System.out.println("i am printing the value using enumeration");
	
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
		
//printing using entry set 	
Set s=st.entrySet();
		
	System.out.println("using entryset : "+s);

//check both hashtable are equal or not 
	
	if (h1.equals(h2)) {
		System.out.println("both are equal");
	}
	
	
System.out.println("giving key : "+st.get("A"));
System.out.println("hashcode is : "+st.hashCode());
	
		
	}

}
