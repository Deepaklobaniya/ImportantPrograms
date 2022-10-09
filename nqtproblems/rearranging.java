package nqtproblems;
import java.util.*;
public class rearranging {
	
	public static void rarrange(String s1, String s2) {
		int count1_1 = 0, count1_0 = 0;
		int count2_1 = 0, count2_0 = 0;
		for(int i = 0; i< 3; i++) {
			if(s1.charAt(i) == '1') 
				count1_1++;
			count1_0++;
			if(s2.charAt(i) == '1') 
				count2_1++;
			count2_0++;
		}
		
		if(count1_0 == count2_0 && count1_1 == count2_1) 
			System.out.println("yes");
		else
			System.out.println("No");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "101";
		String s2 = "011";
		rarrange(s1, s2);
	}

}
