package collectionList;


import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	

	public static void main(String[] args) {
	
		
		///how to  print linkedlist
         //for loop 
		//advance for loop
		//iterator 
		//while loop
		
		LinkedList <String >ll=new LinkedList<String >();
		ll.add("sourov");
		ll.add("rahman");
		ll.add("linkedlist");
		
	System.out.println("i am printing linkedlist : "+ll);
		
		ll.addFirst("adding first");
		System.out.println("i am adding first : "+ll);
		ll.addLast("adding last");
		System.out.println("i am adding last : "+ll);
		ll.get(0);
		System.out.println("i giving me 0 index : "+ll);
		ll.get(1);
		System.out.println("i amgiven me 1 index: "+ll);
		ll.set(0," i am seting in index 0");
		System.out.println("i am setting index 0 : "+ll);
		
		ll.removeFirst();
		System.out.println("i am removin first: "+ll);
		ll.removeLast();
		System.out.println("i am removin last: "+ll);


//printing using for loop
		for (int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
//printing using iterator		
	Iterator its=ll.iterator();
	
	while(its.hasNext()) {
	System.out.println(its.next());
		
	}
		
//printing using advance for loop
	
	
	
	}

}
