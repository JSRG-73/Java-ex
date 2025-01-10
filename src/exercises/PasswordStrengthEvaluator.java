package exercises;

import java.util.Scanner;

public class PasswordStrengthEvaluator {
	
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
		else System.out.println("Include a special character for added security.");
		if(special_symbol)counter++;
		else System.out.println("Increase your password length.");		
		
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
