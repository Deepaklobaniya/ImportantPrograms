package com.Deepak;
import java.util.*;
public class sort {
	public static int[] numberOfPairs(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int pairs = 0;
        for(int i: nums) {
        	if(!set.contains(i)) {
                set.add(i);
            }
            else {
                set.remove(i);
                pairs++;
            }
        }
        return  new int[]{pairs,set.size()};
    }
	public static void main(String[] args) {
		int[] nums = {1,3,2,1,3,2,2};
		int ans[] = numberOfPairs(nums);
		for(int i: ans) {
			System.out.println(i);
		}
	}
}
