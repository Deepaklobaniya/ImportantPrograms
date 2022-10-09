package com.Deepak;
import java.util.*;
public class countSimilarNumber {
	public static List<Integer> count(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					if(list.contains(arr[i])) {
					}
					else {
						list.add(arr[i]);
					}
				}
			}
		}
		System.out.println(list);
		return list;
	}
	public static void main(String args[]) {
		int[] arr = {1,2,1,1,1,1,1,1,1,1,2,2,3,4,4,5,6,3,4,4,4,4,4,4,3,3,3,3,6,8,9,9};
		count(arr);
	}
}