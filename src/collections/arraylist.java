package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static <E>void main(String[] args) {
		//can contains duplicate value
		//maintain insertion order
		//Syschronized 
		//Store on the basis of index
		//retrive all value by for loop or iterator 
		
		
		int a[]=new int[3];
		a[0]=2;
		a[1]=2;
		a[2]=3;
		System.out.println("i am  printing array a size : "+a.length);
		for (int i=0;i<a.length;i++) {
			System.out.print("i am printing array a : "+a[i]);
			System.out.println("\t"+"********");
			
		}
		System.out.println("********");
				
		System.out.println("\t");
		ArrayList<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		System.out.println("I AM PRINTING ARRAY : "+A);
		System.out.println("i am  printing array A size : "+A.size());
	
		Iterator<Integer> ait=A.iterator();
		
		while(ait.hasNext()) {
			
		System.out.println("i am using iterator : "+ait.next());
		}
		
		
		
		
		Employee e1=new Employee("tom",20,"business");
		Employee e2=new Employee("sourov",30,"it");
		Employee e3=new Employee("maliha",40,"driver");
		
	ArrayList<Employee> ar4=new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	Iterator<Employee> it=ar4.iterator();
		
	while(it.hasNext()) {
		Employee emp=it.next();
		System.out.println(	"i am keeping class object in arrayList : "+	emp.name);
		System.out.println(	"i am keeping class object in arrayList : "+	emp.age);
		System.out.println(	"i am keeping class object in arrayList : "+	emp.dept);
	}
		
		
		ArrayList<String > ar=new ArrayList<String > ();
		ar.add("sourov");
		ar.add("rahman");
		ar.add("QA");	
		ar.add("Automation");
		
		for (int i=0;i<ar.size();i++) {
			
			System.out.println("i am printing ar arraylist : "+ar.get(i));
		}

		ArrayList<String > ar1=new ArrayList<String > ();
		ar1.add("nirov");
		ar1.add("rahman");
		ar1.add("QAT");	
		ar1.add("Automation and manual");
		
		
		ar.add(0,"adding in first");
		
for (int i=0;i<ar1.size();i++) {
			
			System.out.println("i am printing ar arraylist : "+ar1.get(i));
		}
		

ar.add(0,"i am adding in index o");
		

for (int i=0;i<ar.size();i++) {
	
	System.out.println("i am printing ar arraylist : "+ar.get(i));
}
		
	

	ar.addAll(ar1);
	
	for (int i=0;i<ar.size();i++) {
		
		System.out.println("i am printing ar arraylist : "+ar.get(i));
	}
		
	
	ar.retainAll(ar1);
	
	
for (int i=0;i<ar.size();i++) {
		
		System.out.println("i am printing ar arraylist : "+ar.get(i));
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
