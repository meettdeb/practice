package com.arrays;

/* 
 * Apparently not the correct way of solving the problem
 * 
 */
public class ArrayRotator {

	public static void main(String arg[]) {
		int numarr[] =  {-1,-100,3,99};
		int k = 2;
		rotate(numarr,k);
	}
	
	public static void rotate(int[] nums, int k) {
		while(k > 0) {
			k--;
			int temp[] = new int[nums.length];
			for(int i=0; i<nums.length;i++) {
				if(i == (nums.length -1)) {
					temp[0] = nums[i];
				}else {
					temp[i+1] = nums[i];	
				}
			}
			nums = temp;
		}
		for(int i=0; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}
}
