package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
    //HashMap is a class implements Map interface 
	//	extends AbstractMap
	//	it contains only unique elements 
	//	stores the value in key and value pair 
	//	may have one null value and multiple null value
	//	it maintain no  order 
    //print all value using for loop entry 
		//map.entry and entry set
    //HashMap is not synchronised --not tread safe
	//concurrent modification exception fail fast condition
		//
		
		
		HashMap<Integer,String > hm =new HashMap<Integer,String >();
		hm.put(1,"sourov");
		hm.put(2, "rahman");
		hm.put(3, "QA");
		hm.put(4,"infour");
		
		HashMap<String,Integer > hmm=new HashMap<String,Integer > ();
		hmm.put("s",01);
		hmm.put("o",02);
		hmm.put("u",03);
		hmm.put("r",04);
	System.out.println(hmm.get("r"));
	
	for (Entry m : hmm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
		
	System.out.println(hm.get(1));	
	
    
		
		
		for(Entry m : hm.entrySet()) 
		{
			
			
		System.out.println(	m.getKey()+" "+ m.getValue());
		}
		
		hm.remove(4);
		System.out.println(hm);
	//
		HashMap<Integer ,Employee > emp=new HashMap<Integer,Employee >();
		
		
		Employee e1=new Employee("tom",24,"QA");
		Employee e2=new Employee ("rom",25,"java");
		Employee e3=new Employee("job",26,"selenium");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		
		for(Entry <Integer,Employee>m : emp.entrySet()) {
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println(key);
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
