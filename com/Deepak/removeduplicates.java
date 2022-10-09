package com.Deepak;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		int fast = 1;
		int slow = 0;
		arr[slow] = arr[fast];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
