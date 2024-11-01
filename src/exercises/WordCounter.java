package exercises;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String string = inScanner.nextLine();		
		//String string = "   Hello,   how are you?   ";
		
		int spacecounter=0;
		boolean flag = false;
		string=string.trim();
		
		for(int i=0;i<string.length();i++) {
			
			//System.out.println(string.substring(i, i+1)+ " "+flag);
			if(string.substring(i, i+1).equals(" ")) {
				if(!flag) {
					flag=true;
					spacecounter++;
				} else continue;
			} else {flag=false;}
		}
		System.out.println("Words: "+(spacecounter+1));
		
	}

}
