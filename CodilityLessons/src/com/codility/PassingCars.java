package com.codility;

public class PassingCars {

	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1, 1, 0, 1 };

		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		if (A.length == 1)
			return 0;

		if (A.length == 2) {
			if (A[0] == 0 && A[1] == 1)
				return 1;
			else
				return 0;
		}

		int count = 0;
		int zeroCount = 0;
		boolean zeroFlag = false;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == 0 && !zeroFlag)
				zeroFlag = true;
			else if (A[i] == 0 && zeroFlag)
				zeroCount++;

			if (zeroFlag && A[i] == 1)
				count = (count + 1) + zeroCount;

			if (count > 1000000000)
				return -1;
		}

		return count;

	}

}
