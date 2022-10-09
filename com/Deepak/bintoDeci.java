package com.Deepak;

public class bintoDeci {
	
	public static void btod(String bnum) {
		int expValue = 0;
		int decimal = 0;
		int powerValue = 1;
		int base = 2;
		int i = bnum.length()-1;
		while(i >= 0) {
			if(bnum.charAt(i) == '1') {
				for(int j = 0; j < expValue; j++) {
					powerValue *= base;
				}
				decimal += powerValue;
				powerValue = 1;
			}
			i--;
			expValue++;
		}
		System.out.println("Decimal of given binary: " + decimal);
	}
	
	public static void main(String[] args) {
		String binary = "1110";
		btod(binary);
	}
}
