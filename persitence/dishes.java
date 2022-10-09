package persitence;
import java.util.*;
public class dishes {
	
	public static void dish(int type) {
		Scanner sc = new Scanner(System.in);
		int i = 0, x = 0, max;
		while(type > 0) {
			
			System.out.print("Enter number of dishes: ");
			int n = sc.nextInt();
			max = 0;
			int[] arr = new int[n];
			for(i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int[] ans = new int[100];
			
			for(i = 0; i < n-1; i++) {
				if(arr[i] == arr[i+1]) {
					i++;
				}
				ans[arr[i]]++;
			}
			
			for(i = 0; i <= 99; i++) {
				if(ans[i] > max) {
					max = ans[i];
					x = i;
				}
			}
			System.out.println(x);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter type of dishes: ");
		int t = sc.nextInt();
		dish(t);
	}
}
