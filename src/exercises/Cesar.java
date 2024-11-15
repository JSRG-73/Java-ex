package exercises;

public class Cesar {


    static String caesarCipher(String text, int shift) {
    	
        StringBuilder result = new StringBuilder();
        shift = shift % 26;

        for (int i = 0; i < text.length(); i++) {
        	
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + shift + 26) % 26 + base);
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String s="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        String encrypted = caesarCipher(s, 3);
        System.out.println("Text: " + encrypted);

    }
}