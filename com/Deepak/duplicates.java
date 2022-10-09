package com.Deepak;
import java.util.*;
public class duplicates {
	
	public static void rDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,2,8,3,4,3,2,5,5};
		rDuplicate(arr);
	}

}
