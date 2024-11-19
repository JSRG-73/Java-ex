package exercises;

public class ConsecutiveDuplicatesRemover {

	public static void main(String[] args) {
		
		 if (s.isEmpty()) {
	            System.out.println("The string is empty.");
	            return;
	        }
		
		String s = "aaabbccddeeffgghhh";
		char c = s.charAt(0);
		StringBuilder sb = new StringBuilder("");
		sb.append(c);
		
		for (int i=0; i<s.length();i++) {
			if (s.charAt(i)!=c) {
				c=s.charAt(i);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
