package com.Deepak;
import java.util.HashMap;
import java.util.Map;
public class SingleNum {
    public static int singleNumber(int[] nums) {
    	int single = 0;
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i=0; i<nums.length; i++) {
    		if(!map.containsKey(nums[i])) {
    			map.put(nums[i],1);	
    		} else {
    			map.put(nums[i],3);
    		}
    		for(Map.Entry<Integer,Integer> m : map.entrySet() ) {
    			if(m.getValue() == 1) {
    				single = m.getKey();
    				break;
    			}
    		}
    	} 
       return single; 
    }
	    public static void main(String[] args) { 
	        int[] nums = {1,1,1,2};
	        singleNumber(nums);
	        System.out.println(singleNumber(nums));
	    }
}
