package exercises;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWords {
	
	public static void main(String[] args) {
		
		String string = " Hello world! Hello, Universe.";		
		HashSet<String> set = new HashSet<String>();
		
		string = string.replaceAll("!|,|\\.|\\?", "").toLowerCase().trim();
		String[] s_array = string.split("\\s+");
		
		for(int i =0;i<s_array.length;i++) {
			//System.out.println(s_array[i]);
			set.add(s_array[i]);
		}
		
		for (String elementString : set) {
			System.out.println(elementString);
		}
		System.out.println("Unique words: "+set.size());
	}
}
