package sortings;
public class selection {
	public static int swap(int[] nums, int i, int min) {
		int temp = nums[min];
		nums[min] = nums[i];
		nums[i] = temp;
		return temp;
	}
	public static void selSort(int[] nums, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			swap(nums, i, min);
		}
		
		for(int arr : nums) {
			System.out.println(arr);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,4,5};
		int n = 4;
		selSort(nums, n);
	}

}
