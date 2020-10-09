package string;

import java.util.HashMap;

public class duplicateWordsInString {

	
	//Hey java is java best language is java
	
	public static void main(String[] args) {
		
		findDuplicateWords("Hey java is java best language is java");

		
		              // "nature is the best form all nature where other is  not all the  best";
	}

	public static void findDuplicateWords(String inputString) {
		
		
		
		String words[]=inputString.split(" ");
		
		HashMap<String ,Integer> wordCount =new HashMap<String ,Integer>();
		
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word,wordCount.get(word)+1);
			}
		}
	}
	

		
		
		
	}
	
	

