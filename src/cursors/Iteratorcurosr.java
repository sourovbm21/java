package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorcurosr {

	//iterator and enumeration moves only forward direction (one direction cursors)
	//can perform remover() method 
	//hasNext(),next(),remove();
	
	
	public static void main(String[] args) {
		
  ArrayList <Integer >al =new ArrayList<Integer >();

  for(int i=0;i<5;i++) {
	al.add(i);
  }
  System.out.println(al);
  
  Iterator<Integer> it=al.iterator();
   
  while(it.hasNext()) {
	 
	  Integer i=  (Integer )it.next();
	  
	  if(i%2==0) {
		  System.out.println("i am printing even number : "+i);
	  }else
		  it.remove();
  }
  System.out.println(al);
		
		
	}

}
