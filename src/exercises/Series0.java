package exercises;

public class Series0 {
	
	public static void main(String args[]) {
		
		String mainString = "3122113378";
		int iterations = 5;
		int l = 0;
		int digit = 0;
		
		
		System.out.println(mainString.length());
		
		//for(int i=0;i<iterations;i++) {
			
			for(int j=0;j<mainString.length();j++) {
				
				
				//System.out.println("\nj: "+j);
				if (digit==0) {
					digit=Integer.parseInt(mainString.substring(0,1));
					l++;
					//System.out.println("start");
				}				
				
				else if (digit==Integer.parseInt(mainString.substring(j,j+1))){
					l++;
					
					//System.out.println("case2");
				} 
				else if(digit!=Integer.parseInt(mainString.substring(j,j+1))){
					System.out.print(l);
					System.out.print(digit);
					l=1;
					digit=Integer.parseInt(mainString.substring(j,j+1));
				}
				
			}
			System.out.println();
			
		//}
		
	}
	
	
}
