package number;

public class swapingString {

	public static void main(String[] args) {
		

		

        
        String father ="sourov";
        String daughter="myrah";
        
        father=father+daughter;
        
        daughter=father.substring(0,father.length()-daughter.length());
        father=father.substring(daughter.length());
        
        System.out.println("father name father : "+father);
        System.out.println("daughter name daughter : "+daughter);
		
	}

}
