package exercises;

public class Series0 {
	
	public static void main(String args[]) {
		
		String mainString = "1", auxString="";
		int iterations = 10;
		int l;
		int digit;
		
		
		System.out.println(mainString.length());
		
		for(int i=0;i<iterations;i++) {
			
			l=0;
			digit=0;
			
			for(int j=0;j<mainString.length();j++) {
				
				
				//System.out.println("\nj: "+j);
				if (j==0) {
					digit=Integer.parseInt(mainString.substring(0,1));
					//System.out.println("start");
				}				
				
				if (digit==Integer.parseInt(mainString.substring(j,j+1))){
					l++;
					//System.out.println("case2");
				} 
				else if(digit!=Integer.parseInt(mainString.substring(j,j+1))){
					
					auxString+=l;
					auxString+=digit;
					l=1;
					digit=Integer.parseInt(mainString.substring(j,j+1));
				}
				
				if(j==mainString.length()-1) {
					auxString+=l;
					auxString+=digit;
				}
				
			}
			
			System.out.println(auxString);
			mainString = auxString;
			auxString="";
			
		}
		
	}
	
	
}
