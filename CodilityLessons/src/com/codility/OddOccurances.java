package com.codility;

import java.util.Arrays;

public class OddOccurances {

	public static void main(String[] args) {
		 int[] arr = { 1, 7, 1, 3, 6, 7, 3,6,44,8,44 };
		 System.out.println(solution(arr));
		
	}

	public static int solution(int[] A) {
		int retVal = 0;


		// 1,1,3,3,6,6,7,7,44
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			
			if (i != A.length-1 && A[i] == A[i + 1])
				i = i + 1;
			else {
				retVal = A[i];
				break;
			}

		}

		return retVal;
	}

}
