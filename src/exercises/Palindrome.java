package exercises;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentenceString="palabras";
		
		if(sentenceString.length()%2==0) {
			System.out.println("even");
			for(int i=0;i<(sentenceString.length()/2);i++) {
				System.out.print(sentenceString.substring(i,i+1));
				System.out.println(sentenceString.substring(i,i+1));
			}
		} else {
			System.out.println("odd");
		}
		
	}

}
