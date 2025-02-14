package exercises;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
	
	public static String check(String s) {
		
		String longest="";
		Set<String> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
	        if(set.contains(s.substring(i,i+1))) {
	        	
	        }
		}
		
		return longest;
	}

	public static void main(String[] args) {

		String s = "abcabcbb";
		
		System.out.println(check(s));
		
	}

}