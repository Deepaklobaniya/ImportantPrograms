package persitence;

import java.util.Arrays;

public class aliceBob {
	
	public static void ab(int[] alice, int[] bob) {
		Arrays.sort(alice);
		Arrays.sort(bob);
		int asum = 0;
		int bsum = 0;
		for(int i = 0; i < alice.length-1; i++) {
			asum += alice[i];
		}
		
		for(int j = 0; j < alice.length-1; j++) {
			bsum += bob[j];
		}
		
		if(asum > bsum) {
			System.out.println("Bob");
		}
		else if(asum < bsum) {
			System.out.println("Alice");
		}
		else {
			System.out.println("Draw");
		}
	}

	public static void main(String[] args) {
		int[] b = {4,1,3};
		int[] a = {2,2,7};
		ab(a, b);
	}
}
