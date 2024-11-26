package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("USA");
		al.add("France");
		al.add("Mexico");
		al.add("Mexico");
		al.add("Mexico");
		al.add("Morocco");

		
		System.out.println(al.stream().distinct());
	}

}
