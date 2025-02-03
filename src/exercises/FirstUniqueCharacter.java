package exercises;

import java.util.HashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s ="character";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                System.out.println("The first unique letter's index is " + i);
                return;
            }
        }
	}
}