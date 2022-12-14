package com.Deepak;

import java.util.*;
public class twoSum {
	
	public static int[] twosumfun(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		for(int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) !=i) {
				return new int[] {map.get(complement), i};	
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 18;
		int[] ans = twosumfun(nums, target);
		
		for(int i: ans) {
			System.out.print(nums[i]+" ");
		}
	}
}
