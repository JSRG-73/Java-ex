package exercises;

import java.util.Scanner;

public class RomanNumeral {
	
	public static String toRoman(String n) {
		
		if(Integer.parseInt(n)<4000 && Integer.parseInt(n)>0) {
			String[] Symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		    int[] Values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		    int number=Integer.parseInt(n);
		    StringBuilder s = new StringBuilder();
		    for (int i = 0; i < Values.length; i++) {
		        while (number >= Values[i]) {
		            s.append(Symbols[i]);
		            number -= Values[i];
		        }
		    }
		    return s.toString();
		}else return "Please enter a number between 1-3999";
	}
	
	public static String toNumeral(String r) {
	    
	    for (int i=1;i<4000;i++) {
	    	if(r.equals(toRoman(String.valueOf(i))))return String.valueOf(i);
	    }
	    return r+" is not a valid number.";
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello!\n\nEnter either a roman number or a normal number and I'll convert it!(From 1 to 3999)\nYour number: ");
		String number = in.next();
		
		
		  try {
	            int n = Integer.parseInt(number);
	            if (n < 1 || n > 3999) {
	                System.out.println("Please enter a number between 1 and 3999");
	            } else {
	                System.out.println("Roman numeral: " + toRoman(number));
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Integer value: " + toNumeral(number.toUpperCase()));
	        }
		
	}

}
