package searching;

public class binarySearch {
	
	public static void binarys(int[] arr, int f, int l, int key) {
		int mid = (f+l)/2;
		
		while(f <= l) {
			if(arr[mid] == key) {
				System.out.println("Element is found at index: "+mid);
				break;
			}
			else if(arr[mid] < key) {
				f = mid+1;
			}
			
			else {
				l = mid - 1;
			}
			
			mid = (f+l)/2;
		}
		
		if(f > l) {
			System.out.println("Element is not present");
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		binarys(arr, 0, arr.length-1, 4);
	}
}
