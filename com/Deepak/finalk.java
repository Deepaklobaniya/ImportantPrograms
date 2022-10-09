package com.Deepak;
import java.util.*;
public class finalk {
	
	public static void fun(String str) {
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int right = 0;
		int maxlen = 0;
		
		while(right < str.length()) {
			if(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left++));
			}
			set.add(str.charAt(right++));
			maxlen = Math.max(set.size(), maxlen);
		}
		System.out.print(maxlen);
	}
	
	public static void main(String[] args) {
		String str = "abcdbb";
		fun(str);
	}
}
