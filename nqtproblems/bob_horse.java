package nqtproblems;
import java.util.*;
public class bob_horse {

	public static int bobhorse(int[] nums, int k, int n) {
		int i = 0;
		int j = 0;
		int sum  = 0;
		int count = 0;
		int fcount = 0;
		while(j < n) {
			if(nums[j] >= k) {
				j++;
				i = j;
				count = 0;
			}
			else if(sum+nums[j] >= k) {
				sum -=nums[i];
			 	i++;
			 	count--;
			}
			else {
				sum += nums[j];
				j++;
				count++;
			}
			fcount = Math.max(fcount, count);
		}
		return fcount;
	}
	
	public static void main(String[] args) {
		int[] nums = {30, 40, 50, 20, 20, 10, 90, 10, 10, 10};
		int k = 100;
		int n = 10;
		bobhorse(nums, k, n);
		System.out.println(bobhorse(nums, k, n));
	}

}
