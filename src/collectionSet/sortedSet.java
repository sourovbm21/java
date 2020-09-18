package collectionSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {

	//Collection ->Set->SortedSet->NavigableSet->TreeSet;
	//child interface of Set
	//represent  of individual group where some sorting and duplicates are not allowed 
	//have no new method so we can use all method from collection
  
	
	
	public static void main(String[] args) {
		//TreeSet
		//underlying  data structure is Balanced Tree
		//duplicate not allowed 
		//insertion order not applicable
		//some Sorting order preserved
		//Heterogeneous object are not allowed --RE:class cast eXception
		//in total collection there are two place where Heterogeneous object are not allowed-TreeSet and TreeMap
		//null allowed but only once 
		//sorting order for number is Ascending and sorting order for String is Alphabetical order  
	
		TreeSet<String> t =new TreeSet<String>();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
	
	
		System.out.println("i am printing t : "+t);
		System.out.println(t.comparator());//if set is in default natural sorting order then it will give null 
	System.out.println("****************");
	
		
	 }

}
