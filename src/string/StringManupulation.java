package string;

public class StringManupulation {

	public static void main(String[] args) {
		
    String str="the rains have started here";
    System.out.println(str.length());
    System.out.println(str.charAt(0));
    System.out.println(str.indexOf('s'));//first occurrence of s
    System.out.println(str.indexOf('s', 9));
    System.out.println(str.indexOf('s',str.indexOf('s')+1));//second occurrence of s
    System.out.println(str.indexOf("good"));//no string then give -1
    System.out.println(str.indexOf('t'));
    //string compartion 
    String s="sourov";
    String s1="souroV";
    System.out.println(s.equals(s1));
    System.out.println(s.equalsIgnoreCase(s1));
    //String substring 
    System.out.println(s.substring(1));
    System.out.println(s.substring(0, 2));
    try{
    	 System.out.println(s.subSequence(0, 'v'));
    	    
    }catch (Exception e) {
    	System.out.println(e);
    }finally{
    	System.out.println("i am in finally block : ");
    }
    //split 
    String price ="$100-kg";
    String newprice[]=price.split("-");
   String p1= newprice[0];
   String p2= newprice[1];
    for (int i=0;i<newprice.length;i++) {
    	System.out.println(newprice[i]);
    }
    System.out.println("price p1 : "+p1);
    System.out.println("price p2 : "+p2);
   
   System.out.println( p1.concat("after concat"));
	
   //String concatination
   String x="hello";
   String y="world";
   int a=100,b=200;
		System.out.println(x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y);
		
//swaping two string 
		
		
		
	}

}
