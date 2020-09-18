package javapractise;

import java.util.ArrayList;

public class coreJava {

	public static void main(String[] args) {
		
		//ArrayList
/*collection =>have 3 interface=> list,set,map,
		 *list=ArraysList,linkedlist,vector
		  * set=HashSet,LinkedHashSet,TreeSet
		  * map=HashMap,TreeMap,LinkedHashMap    
		     
		   */
	/*	ArrayList<String> a=new ArrayList<String>();
		a.add("sourov");
		a.add(1,"rahman");
		a.add("m");
		a.add(1,"rahmanmmmm");
	System.out.println(	a.indexOf("rahman"));
	System.out.println(		a.indexOf("rahmanmmmm"));
		System.out.println(a);
		//a.remove(1);
		//a.remove("rahmanmmmm");
		System.out.println(a);*/
		
		
//Array 
	int b[]=new int[5];
	b[0]=1;
	b[1]=2;	
	System.out.println("i am in array one ");
	//System.out.println(b);
	System.out.println(b[0]);
	
	int c[]= {1,3,4,5};
	System.out.println("i am in array second ");
	//System.out.println(c);
	System.out.println(c[0]);
	
	System.out.println("i am in multi array ");
	int m[][]= {{10,11,12},{13,14,15}};
	
	
for(int i=0;i<2;i++)
           {
	   for(int j=0;j<3;j++)
	              {
		            System.out.println(m[i][j]);
		
	              }
             }
	




	}

}
