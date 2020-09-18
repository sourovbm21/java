package string;

public class stringCompare {

	
	public static void main(String[]args) {
	
	/*equals()=object
	
	-contant the original content of the string ;
	*/
	
	
	/*		== primitive data type
	 * compare refernce of the objects not the value
	 * */
	
	String s="Sourov1234";
	String s1="Sourov1234";
	String s3="maliha";
	String s4="myrah";
	String s5=new String ("labtop");
	String s6=new String("labtop");
	
	System.out.println(s.equals(s1));
	System.out.println(s.equals(s3));
	System.out.println(s==s5);
	System.out.println(s5==s6);
}
}