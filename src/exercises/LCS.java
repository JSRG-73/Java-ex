package exercises;

import java.util.Arrays;

public class LCS {
	
	public static int longest(int[] arr) {
		Arrays.sort(arr);
		int counter=1;
		int max=0;
		
		if(arr.length==0) return 0;
		if(arr.length==1) return 1;
		
		for(int i=1;i<arr.length;i++) {
			if (arr[i]==arr[i-1]) continue;

			if(arr[i]-1==arr[i-1])counter++;
			else counter=1;
			
			if(counter>max) {max=counter;}
		}
		if(max==0)return counter;
		return max;
	}

	public static void main(String[] args) {
		// Longest Consecutive Sequence
		int[] arr = {1, 2, 8, 3, 9, 4, 10, 5, 11, 6, 12, 7};
		System.out.println(longest(arr));
	}

}
