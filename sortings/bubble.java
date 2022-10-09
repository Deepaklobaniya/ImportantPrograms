package sortings;

/*package whatever //do not write package name here */
import java.io.*;
import java.util.Arrays;
class bubble {
public static void firstMissingPositive(int[] nums, int n) {
	
	for(int i = 0; i < n-1; i++) {
		for(int j = 0; j < n-1; j++) {
			if(nums[j] > nums[j+1]) {
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(nums));
}
public static void main(String[] args)
{
	int arr[] = {4,2,1,5,3};
	int n = arr.length;
	firstMissingPositive(arr, n);
}
}
