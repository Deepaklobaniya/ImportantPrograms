package com.Deepak;

public class reverseArray {
	
	public static int[] rev(int[] arr) {
		int len = arr.length-1;
		int i = 0, j = len;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for(int x : rev(arr)) {
			System.out.print(x+" ");
		}
	}

}
