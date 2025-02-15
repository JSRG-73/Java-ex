package exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

	public static int check(String s) {

		HashMap<Character, Integer> lastSeen = new HashMap<>();
		int maxLength = 0;
		int left = 0;

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);

			if (lastSeen.containsKey(c)) {
				left = Math.max(left, lastSeen.get(c) + 1);
			}

			lastSeen.put(c, right); 
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

	

	public static void main(String[] args) {

		String s = "pwwkew";

		System.out.println(check(s));

	}

}