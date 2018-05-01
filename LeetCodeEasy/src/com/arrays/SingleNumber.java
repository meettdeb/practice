package com.arrays;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String arg[]) {
		int numarr[] =  {1,1,2};
		System.out.println(singleNumber(numarr));
	}
	
	public static int singleNumber(int[] numarr) {
		int singleNumber = 0;
		int i = 0;
		if(numarr.length == 1) {
			singleNumber = numarr[0];
			return singleNumber;
		}
		Arrays.sort(numarr);
		while(i < (numarr.length-1)) {
			if(numarr[i] == numarr[i+1]) {
				i=i+2;
				if(i >= (numarr.length-1)) {
					singleNumber = numarr[i];
					return singleNumber;
				}
			}else {
				singleNumber = numarr[i];
				return singleNumber;
			}
		}
		return  singleNumber;
		
	}
}
