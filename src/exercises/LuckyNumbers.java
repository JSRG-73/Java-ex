package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumbers {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public boolean isPrime(int n) {
		if (n <= 1) return false;

        for (int i = 2; i <n; i++) {
        	if (n % i == 0) return false;
        }

        return true;
	}
	
	public int findNumbers(int n) {
		int result=0;
		String aux="";
		int counter=0;
		for (int i=0;i<=n;i++) {
			aux=String.valueOf(i);
			
			for (int j=0;j<aux.length();j++) {
				counter+=Character.getNumericValue(aux.charAt(j));
			}
			//System.out.println(counter);
			if(isPrime(counter)) {
				result++;
				list.add(i);
			}
			counter=0;
		}
		
		return result;
	}
	
	public ArrayList<Integer> getList() {
		return list;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Please enter a number between 1 and 10,000: ");

		while (true) {
			try {
				n = in.nextInt();
				if(n>0 && n<10000) break;
				else System.out.print("Your number is out of range, please enter a number between 1 and 10,000: ");
				
			} catch (Exception e) {
				System.out.print("That's not a valid input, please enter a number between 1 and 10,000: ");
				in.nextLine();
			}
		}
		in.close();

		LuckyNumbers ln = new LuckyNumbers();
		
		System.out.println(ln.findNumbers(n));
		System.out.println(ln.getList());
		
	}
}