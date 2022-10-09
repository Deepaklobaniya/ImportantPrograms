package com.Deepak;
import java.util.*;
public class swapNum {

	public static void swap(String str1, String str2) {
		System.out.println("Before swapping: "+str1+" "+str2);
		str1 = str1+str2;
		str2= str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapping: "+str1+" "+str2);
	}
	public static void main(String[] args) {

		String s1="Deepak";
		String s2 = "Lobaniya";
		swap(s1, s2);

	}

}
