package com.arrays;

public class MoveZeroes {
	public static void main(String arg[]) {
		int numarr[] =  {0,1,0,3,12};
		movezeroes(numarr);
	}
	
	public static void movezeroes(int[] nums) {
		int lastNonZeroFoundAt = 0;
		for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            nums[lastNonZeroFoundAt++] = nums[i];
	        }
	    }
	    // After we have finished processing new elements,
	    // all the non-zero elements are already at beginning of array.
	    // We just need to fill remaining array with 0's.
	    for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
	        nums[i] = 0;
	    }
		for(int i=0; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}
}
