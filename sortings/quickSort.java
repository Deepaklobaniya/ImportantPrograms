package sortings;

public class quickSort {
	
	public static void quicksort(int[] arr, int lo, int hi) {
		if(lo > hi) 
			return;
		
		int pivot = arr[hi];
		int pi = partition(arr, pivot, lo, hi);
		quicksort(arr, lo, pi-1);
		quicksort(arr, pi+1, hi);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int pivot, int lo, int hi) {
		int i = 0;
		int j = 0;
		
		while(i <= hi) {
			if(arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			}
			else
				i++;
		}
		return j-1;
	}
	
	public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }
	
	public static void main(String args[]) {
		int[] arr = {3, 5, 4, 2, 8, 1, 7, 6};
		quicksort(arr, 0, arr.length - 1);
	    print(arr);
	}
}
