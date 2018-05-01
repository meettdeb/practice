package com.arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String arg[]) {
		int numarr[] =  {1,1,2};
		removeDuplicates(numarr);
	}
	
	public static int removeDuplicates(int[] A) {
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				
				A[j] = A[i];
				i++;
				j++;
			}
		}
	 
		int[] B = Arrays.copyOf(A, j + 1);
		for(int k =0; k < B.length; k++ ) {
			System.out.println(B[k]);
		}
		return B.length;
	}
}
