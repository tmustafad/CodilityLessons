package com.codility;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 5, 11, 13, 12, 9, 10, 4, 6, 8 };

		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {

		long N=A.length+1;
		long sum=N*(N+1)/2;
		
		for (int i = 0; i < A.length; i++) {
			sum-=A[i];
		}
	
		return (int)sum;
	}

}
