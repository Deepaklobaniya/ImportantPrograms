package com.Deepak;
import java.util.*;
public class anaGram {

	public static boolean anagramCheck(String s1, String s2) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		for(char c: s1.toCharArray()) {
			if(map.containsKey(c)) 
				map.put(c,map.get(c)+1);
			map.put(c,1);
		}
		
		int count = map.size();
		for(char c: s2.toCharArray()) {
			if(map.containsKey(c)) 
				map.put(c,map.get(c)-1);
			if(map.get(c) == 0)
				count -= 1;
		}
		
		return count == 0 ? true: false;
}
	public static void main(String[] args) {
		String s1 = "Deepak";
		String s2 = "pakDee";
		anagramCheck(s1, s2);
		System.out.println(anagramCheck(s1, s2));
	}
}
