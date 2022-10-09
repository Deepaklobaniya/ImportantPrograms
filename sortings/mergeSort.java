package sortings;

public class mergeSort {
	
	public static int[] mergesort(int[] arr, int l, int r) {
		
		// base case if left and right both are equal we can return any from this
		if(l == r) {
			int[] ba = new int[1];
			ba[0] = arr[l];
			return ba;
		}
		
		//find mid
		int mid = (l+r)/2;
		
		//call mergeSort recursive for divide array into two parts
		int[] fsh = mergesort(arr, l, mid); // this is first sorted part
		int[] ssh = mergesort(arr, mid+1, r); // this is second part
		int[] fsa = mergeSortedArrays(fsh, ssh);  // here we merge both above two sorted parts(fsh & ssh)
		return fsa; // finally our array is sorted ans we returned
	}
	
	// here we created our mergeSortedArrays for merge both above arrays.
	public static int[] mergeSortedArrays(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] ans = new int[a.length + b.length]; // final returned array(length is a.length + b.length because both sorted arrays are equal two intial length) 
		while(i < a.length && j < b.length) { // here we check condition
			if(a[i] <= b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			}
			else {
				ans[k] = b[j];
				j++;
				k++;
			}
		}
		// if i less then a.length then this while loop will execute 
		while(i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}
		// if j less then b.length then this while loop will execute
		while(j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}
		
		return ans; //final we returned our merged sorted array ans.
	}
	
	public static void main(String args[]) {
		int[] arr = {7, 4, 1, 3, 6, 8, 2, 5}; 
		int n = arr.length;
		int[] a = mergesort(arr, 0, n-1); // created array a for print
		
		for(int i = 0; i < n; i++) { // printing every element of array 
			System.out.println(a[i]);
		}
	}
}
