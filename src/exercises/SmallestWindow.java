package exercises;

public class SmallestWindow {
	
	public String find(String s, String t, int window) {
		
		String aux ="";
		
		for(int i=0;i<=s.length()-window;i++) {
			aux=s.substring(i,i+window);
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		String s = "ADOBECODEBANC", t = "ABC";
		
		SmallestWindow sw = new SmallestWindow();
		
		for (int i=t.length(); i<s.length();i++) {
			if(!sw.find(s, t, i).equals("")) {
				System.out.println(sw.find(s, t, i));
				break;
			}
		}
		
		//sw.find(s, t, 3);
	}

}
