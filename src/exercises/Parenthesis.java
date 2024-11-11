package exercises;

public class Parenthesis {

	static boolean function(String string) {
		int p = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i, i + 1).equals("("))
				p++;
			else
				p--;
			if (p < 0)
				return false;
		}
		return p==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "(((())(()(()))((())()))(()(()))(()(())))";
		String mal = "(((()())(()))())()(()))())((((()))";

		if (function(mal))
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
	}
}
