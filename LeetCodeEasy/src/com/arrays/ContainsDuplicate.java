package com.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String arg[]) {
		int numarr[] =  {1,2,3,4,5};
		System.out.println(containsDuplicates(numarr));
	}
	
	public static boolean containsDuplicates(int[] numarr) {
		boolean isDuplicate = false;
		Arrays.sort(numarr);
		int i = 0;
		while(i < (numarr.length-1)) {
			if(numarr[i] == numarr[i+1]) {
				return true;
			}
			i++;
		}
		return isDuplicate;
	}
}
