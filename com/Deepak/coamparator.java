package com.Deepak;
import java.util.*;
public class coamparator {

	public static void compareWFre(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int x:arr) {
			map.put(x,map.getOrDefault(x,0)+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input:  [1,2,3,2,1,4,1,2]
		//output: [1,1,1,2,2,2,3,4]
		int[] arr = {1,2,3,2,1,4,1,1,1,2};
		compareWFre(arr);
	}

}
