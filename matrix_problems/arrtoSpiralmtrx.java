package matrix_problems;
import java.util.*;
public class arrtoSpiralmtrx {
	
	public static int[][] printSpiralOrder(int arr[], int M, int N) {
		
		int[][] mtrx = new int[M][N];
		int left = 0, right = N - 1;
		int top = 0, bottom = M - 1;
		int index = 0;
		
		if(arr == null || arr.length == 0) {
			return null;
		}
		
		while(true) {
			
			if(left > right && top > bottom) {
				break;
			}
			
			//for top row
			for(int i = left; i <= right; i++) {
				mtrx[top][i] = arr[index++];
			}
			top++;
		
			//for right
			for(int i = top; i <= bottom; i++) {
				mtrx[i][right] = arr[index++];
			}
			right--;
			
			//for bottom row
			for(int i = right; i >= left; i--) {
				mtrx[bottom][i] = arr[index++];
			}
			bottom--;
			
			//for left
			for(int i = bottom; i >= top; i--) {
				mtrx[i][left] = arr[index++];
			}
			left++;
		}
		
		return mtrx;
	}

	public static void main(String[] args) {
		// `M × N` matrix
        int M = 5;
        int N = 5;
 
        // an array of size `M×N`
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
 
        int[][] mat = printSpiralOrder(arr, M, N);
        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }
	}
}
