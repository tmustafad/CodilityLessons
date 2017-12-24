package com.codility;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		int[] A = { 10, 2, 5, 1, 8, 20 };
		long a = 2;

		int[] B = { 10, 50, 5, 1 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		if (A.length < 3)
			return 0;

		Arrays.sort(A);

		for (int i = 0; i < A.length - 2; i++) {
			long p = A[i];
			long q = A[i + 1];
			long r = A[i + 2];

			if ((p + q > r) && (q + r > p) && (r + p > q))
				return 1;

		}

		return 0;

	}

}
