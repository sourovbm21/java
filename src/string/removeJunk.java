package string;

public class removeJunk {

	public static void main(String[] args) {
		

		String s="***&&&@@@sourov****";
		//using regular experssion
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
	}

}
