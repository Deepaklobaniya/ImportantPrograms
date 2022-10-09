package com.Deepak;

public class GCD {
	public static int gcdnum(int nums[]) {
		int smallest = nums[0];
        int largest = nums[nums.length - 1];
        int gcd = 1;
        for(int i=0; i<nums.length; i++){
            if(smallest > nums[i])
                smallest = nums[i];
            
            if(largest < nums[i])
                largest = nums[i];
        }
        if(largest%smallest == 0)
            return smallest;
        for(int i=1; i<smallest; i++){
            if(smallest%i==0 && largest%i==0)
                gcd = i;
            return gcd;
        }
        return gcd;
	}
	
	public static void main(String[] args) {
		int nums[] = {5, 10, 23};
		gcdnum(nums);
		System.out.println(gcdnum(nums));
	}

}
