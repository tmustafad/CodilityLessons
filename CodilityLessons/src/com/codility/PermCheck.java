package com.codility;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		int arr[] = {1};

		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {
	

		Arrays.sort(A);
		if (A[0] != 1) {
		    return 0;
		}

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i + 1] - A[i] != 1)
				return 0;
		}

		return 1;
	}

}
