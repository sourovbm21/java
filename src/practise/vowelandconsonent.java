package practise;

public class vowelandconsonent {

	public static void main(String[] args) {
		

		
		char ch='t';
		
		if(ch=='a' ||ch=='e'||ch=='i' ||ch=='o' ||ch=='u') {
			System.out.println(ch+" given character is vowel");
		}else 
			System.out.println(ch+" given character is consonent");
		
		
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" given character is vowel");
			break;
			
			default:
				System.out.println(ch+" given character is consonent");
		        break;
		        
		}
		
		
	}

}
