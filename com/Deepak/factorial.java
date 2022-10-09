package com.Deepak;

import java.util.Scanner;
public class factorial {
	
	//Without Recursion
	public static int factNum(int num) {
		int n=1;
		for(int i =1; i<=num; i++) {
			n = n*i;
		}
		return n;	}
	
	//By Recursion
	public static int factRec(int num) {
		if(num == 0) {
			return 1;
		}
		
		return  num*factRec(num-1);
	}
	
	public static void main(String args[]) {
		System.out.println("Enter a number for Factorial");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		factNum(num);
		factRec(num);
		System.out.print("This output by Recursion: ");
		System.out.println(factRec(num));
		System.out.print("This output by Without Recursion: ");
		System.out.print(factNum(num));
	}
}
