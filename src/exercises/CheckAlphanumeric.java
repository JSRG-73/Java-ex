package exercises;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAlphanumeric {

	public static void main(String[] args) {
		
		String string = "qwertyuiopasdfg";
		
		Pattern pattern = Pattern.compile("z");
		Matcher matcher =pattern.matcher(string);
		
		if(matcher.find()) {
			System.out.println("sss");
		}
		
	}

}
