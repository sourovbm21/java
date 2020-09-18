package practise;

import java.util.Arrays;

public class string {

	public static void main(String[] args) {
		

		totalNumberCharacterString();
		countingVowelConsonant ();
		stringAnagram();

	}

	private static void stringAnagram() {
		
		String s1="Brag";
		String s2="Grabe";
		String s=s1.toLowerCase();
		String ss=s2.toLowerCase();
		
		if(s.length()!=ss.length()) {
			System.out.println("both are not angram");
		}else {
		char si[]=	s.toCharArray();
		char sii[]=ss.toCharArray();
			
			Arrays.sort(si);
			Arrays.sort(sii);
			 
			if(Arrays.equals(si, sii)) {
				System.out.println("both are Anagram");
			}
		}
		
		
	}

	private static void countingVowelConsonant() {
		
		String s="This is a really simple sentence";
		String st=s.toLowerCase();
		int vowel=0;
		int cons=0;
		
		for (int i=0;i<st.length();i++) {
			
			if (st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				vowel++;
			}else if  (st.charAt(i)>='a'&st.charAt(i)<='z'){
				cons++;
				
			}
		}
		System.out.println(" total vowel is : "+vowel);
		System.out.println("total constent is : "+cons);
	}

	private static void totalNumberCharacterString() {
		
  int count =0;
		String string ="The best of both worlds";
		
		System.out.println(string.length());
	
	     //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i)!= ' ')    
                count++;    
       
        }    
     	System.out.println("after deleting all spaces : "+count);
		
	}

}
