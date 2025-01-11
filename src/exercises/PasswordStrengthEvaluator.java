package exercises;

import java.util.Scanner;

public class PasswordStrengthEvaluator {
	
	private static boolean isSequential(String ps) {
        for (int i = 0; i < ps.length() - 1; i++) {
            if (ps.charAt(i) + 1 == ps.charAt(i + 1)) return true;
            if (ps.charAt(i) - 1 == ps.charAt(i + 1)) return true; 
        }
        return false;
    }

    private static boolean isRepeatedPattern(String ps) {
        String pattern = ps.substring(0, ps.length() / 2);
        if (ps.length() % pattern.length() == 0 && ps.replace(pattern, "").isEmpty()) return true;
        return false;
    }

    private static boolean isCommonPassword(String ps) {
        String[] commonPasswords = {"password", "123456", "qwerty", "abc123", "111111", "iloveyou", "admin"};
        for (String common : commonPasswords) {
            if (ps.equalsIgnoreCase(common)) return true;
        }
        return false;
    }

	
	public static String evaluator(String ps) {
		
		int counter = 0;
		String specialChars = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		boolean uppercase=false;
		boolean number = false;
		boolean special_symbol=false;
		
		//Evaluating emptiness
		if(ps.isEmpty())return "Your password is empty!";
		
		//Evaluate length
		if(ps.length()<5) counter=0;
		else if (ps.length()<8)counter++;
		else counter+=2;

		
		for (int i=0;i<ps.length();i++) {
			if(Character.isUpperCase(ps.charAt(i)))uppercase = true;
			if(Character.isDigit(ps.charAt(i)))number = true;
			if (specialChars.indexOf(ps.charAt(i)) != -1)special_symbol = true;
		}
		if(uppercase)counter++;
		else System.out.println("Add at least one uppercase letter.");
		if(number)counter++;
		else System.out.println("Increase your password length.");
		if(special_symbol)counter++;
		else System.out.println("Include a special character for added security.");	
		
		if (isSequential(ps)) return "Your password is too weak: Avoid sequential characters!";
        if (isRepeatedPattern(ps)) return "Your password is too weak: Avoid repeated patterns!";
        if (isCommonPassword(ps)) return "Your password is too weak: Avoid common weak passwords!";
		
		if(counter <2)return("Your password is too weak!");
		if(counter <5)return("Your password is secure enough");
		else return "Your password is very strong!";
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a password to check its strenght\nPassword: ");
		String ps = in.next();
		
		System.out.println(evaluator(ps));

	}

}
