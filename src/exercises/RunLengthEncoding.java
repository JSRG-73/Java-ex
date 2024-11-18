package exercises;

public class RunLengthEncoding {

	public static void main(String[] args) {

		String string1 = "aaabbcdddde";
		String string2 = "ppppqqrrrsssssttttttuuuuvvvwwxxxyyyzzz";
		String string = "aaaaaaaaaaabbbbbbccccccccccddddddddddddddeeeeeeefffffffffggggggggghhhhhhhhh";
		
		Character c=string.charAt(0);
		int counter=0;
		StringBuilder sb = new StringBuilder("");
		
		if (string.isEmpty()) {
		    System.out.println("La cadena está vacía");
		    return;
		}
		
		for (int i=0;i<string.length();i++) {
			if(c==string.charAt(i)) counter++;
			else {
				sb.append(c).append(counter);
				c=string.charAt(i);
				counter=1;
			}
		}
		sb.append(c).append(counter);
		System.out.println(sb);
	}
}
