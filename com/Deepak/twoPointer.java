//find string is present in main string and also it is palindrome.

package com.Deepak;

public class twoPointer {
	public static boolean pal(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i < j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void fun(String str, String target) {		
		if(pal(target) == true) {
			 	str.indexOf(target);
				System.out.println("present and pal: "+ target);
				}
		else {
			System.out.println("This is not palindrome: "+target);
		}
	}

	public static void main(String[] args) {
		String str = "abpp";
		String target = "pp";
		fun(str, target);
	}
}
