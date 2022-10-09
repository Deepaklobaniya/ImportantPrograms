package com.Deepak;

public class primeNum {
	
	public static void isPrime(int num) {
		int count = 0;
		if(num <= 1) {
			count++;
		}
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println("This is not prime");
		}
		else {
			System.out.println("This is prime");
		}
	}
	
	public static void main(String[] args) {
		int num = 8;
		isPrime(num);
	}
}
