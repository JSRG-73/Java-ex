package exercises;

import java.util.Scanner;

public class PasswordStrengthEvaluator {
	
	public static String evaluator(String ps) {
		
		int counter = 0;
		
		//Evaluating emptiness
		if(ps.isEmpty())return "Your password is empty!";
		
		//Evaluate length
		if(ps.length()<5) counter=0;
		else if (ps.length()<8)counter++;
		else counter+=2;
		
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a password to check its strenght\nPassword: ");
		String ps = in.next();
		
		System.out.println(evaluator(ps));

	}

}
