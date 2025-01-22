package exercises;

public class Pangram {
	
	public static String checkPangram(String s) {
		
		s=s.toLowerCase();
		
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) return "It's not a pangram.";
			//System.out.println(s.indexOf(c));
		}
		
		return "It's a pangram!";
	}

	public static void main(String[] args) {

		String p = "The quick brown fox jumps over the lazy dog";
		System.out.println(checkPangram(p));

	}

}
