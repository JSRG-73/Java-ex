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

        al.stream().distinct().count();
        
        List<String> result = al.stream().distinct()
        	    .map(String::toUpperCase)
        	    .filter(word -> word.length() > 5)
        	    .toList();

        	System.out.println(result);        
        System.out.println(result);
    }
}
