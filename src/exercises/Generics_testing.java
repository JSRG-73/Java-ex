package exercises;

public class Generics_testing {

	public static void main(String[] args) {

		Generics_practice<String> gString= new Generics_practice<>();
		gString.setsomething("This is a String, hello!");
		
		System.out.println(gString.getSomething());

	}

}
