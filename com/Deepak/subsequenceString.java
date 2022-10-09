package com.Deepak;
class subsequenceString {
	
	public static boolean issequence(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int i = 0, j = 0;
		while(i < n && j < m) {
			if(s1.charAt(i) == s2.charAt(j))
				i++;
			j++;
		}
		// 
		return i == n;
	}
	
	public static void main(String[] args) {
		String s1 = "geesp";
		String s2 = "geeksforgeeks";
		System.out.println(issequence(s1, s2));
	}
}