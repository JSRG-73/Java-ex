package exercises;

public class SmallestWindow {
	
	public String find(String s, String t, int window) {
		
		String aux ="";
		boolean flag=false;
		
		if(s.length()==t.length()) return s;
		if(s.length()<t.length()) return aux;
		
		for(int i=0;i<=s.length()-window;i++) {
			aux=s.substring(i,i+window);
			flag=true;
			for(char c : t.toCharArray()) {
			    if(aux.indexOf(c)==-1)flag=false;
			}
			if(flag)return aux;
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		String s = "ZZZZAYYBZZZCZZ", t = "ABC";
		
		SmallestWindow sw = new SmallestWindow();
		
		for (int i=t.length(); i<s.length();i++) {
			if(!sw.find(s, t, i).equals("")) {
				System.out.println(sw.find(s, t, i));
				break;
			}
		}
	}
}