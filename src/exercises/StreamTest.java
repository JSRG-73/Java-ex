package exercises;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("USA");
        al.add("France");
        al.add("Mexico");
        al.add("Mexico");
        al.add("Mexico");
        al.add("Morocco");

        al.stream().distinct().forEach(System.out::println);
        
        List<String> result = al.stream()
        	    .filter(word -> word.startsWith("m"))
        	    .map(String::toUpperCase)
        	    .sorted()
        	    .toList();
        
        System.out.println(result);
    }
}
