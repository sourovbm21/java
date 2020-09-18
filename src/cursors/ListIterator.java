package cursors;


import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		
		//it is applicable only for list implement class object 
        //this bi direction cursors 
		//we can perform read,remove,replace ,addition of new object 
		
		
		//ArrayList<Object> al=new ArrayList<Object>();
		ArrayList<String >ll=new ArrayList <String>();
		ll.add("sourov");
		ll.add("maliha");
		ll.add("myrah");
		ll.add("azan");
		ll.add("arish");
		System.out.println(ll);
		
    ListIterator  ltr= (ListIterator) ll.listIterator();
    
  

	}

}
