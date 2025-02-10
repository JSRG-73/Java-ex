package exercises;

public class MostFrequentCharacter {
	public static char mostFrequent(String s) {
		char result='a';
		int counter, max=0;
		s=s.toLowerCase();
		
		for(char c='a';c<='z'; c++) {
			counter=0;
			for(char ci : s.toCharArray()) if(c==ci) counter++;
			
			if(counter>max) {
				max=counter;
				result=c;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(mostFrequent("banana"));
	}

}
