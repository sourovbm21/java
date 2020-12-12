package string;

public class findingCharCountinString {

	public static void main(String[] args) {
		


		 //finding number of character present in given String 
		   
		 
		       int count = countOccurance("characcccter",'c');
		       System.out.println("total c count is : "+count);
	}
	
	
	
public static int  countOccurance(String word,char character) {
		
		int count =0;
		for (int i=0;i<word.length();i++) {
			
			if(word.charAt(i)==character) {
				count++;
			}
		}
		
		
		return count;
	}
	

}
