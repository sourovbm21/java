package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class arrayListconcept {

	
	//by default arraylist is not synchronized 
	
	public static void main(String[] args) {
		

		
		//ArrayList <String > names=new ArrayList<String >();
		
		//making this ArrayList synchronised 
		//but for add or remove we don't need explicit Synchronisation
		//but for fetch or traverse the value of this list -we have to use explicit synchronisation
		List <String >names=Collections.synchronizedList(new ArrayList<String >());
		
		names.add("java");
		names.add("python");
		names.add("ruby");
		
		synchronized(names) {
			
			Iterator<String>name=names.iterator();
			
			while(name.hasNext()) {
				System.out.println(name.next());
			}
		}
		
		CopyOnWriteArrayList<String>  emplist=new CopyOnWriteArrayList<String>();
		emplist.add("tom");
		emplist.add("rom");
		emplist.add("kom");
		
		
		for (String emp:emplist) {
			System.out.println(emp);
		}
		
		//removing duplicate elements form arraylist 
		
		CopyOnWriteArrayList<Integer> numbers=new CopyOnWriteArrayList<Integer>(Arrays.asList(1,1,5,6,5,6,2,3,2,1,4,5,6,7,8,10,6));
		
		LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<Integer>(numbers);
		CopyOnWriteArrayList<Integer> numberslistWithoutDuplicate=new CopyOnWriteArrayList<Integer>(linkedhashset);
		System.out.println(numberslistWithoutDuplicate);
		
		
		
		//using stream 
		CopyOnWriteArrayList<Integer> secondNumber=new CopyOnWriteArrayList<Integer>(Arrays.asList(1,1,5,6,5,6,2,3,2,1,4,5,6,7,8,10,6));
		          List<Integer>unique=secondNumber.stream().distinct().collect(Collectors.toList());
		          System.out.println("the list is : "+unique);
		
		/// 
		          
		          ArrayList <String >al =new ArrayList<String>(Arrays.asList("sourov","sourov","maliha","myrah"));
		          HashSet <String> hs =new HashSet<String>(al);
		          System.out.println("my practise is : "+hs);
		          
		          
	
		
		
	}

}
