package com.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		// int arr[] = { 1, 3, 1, 3, 2, 1, 3 };
		int arr[] = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println(solution2(5, arr));
	}

	public static int solution(int X, int[] A) {

		long sum = X * (X + 1) / 2;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
			if (set.stream().mapToInt(j -> j.intValue()).sum() == sum) {
				return i;
			}

		}

		return -1;
	}

	public static int solution2(int X, int[] A) {

		long sum = X * (X + 1) / 2;
		Set<Integer> set = new HashSet<Integer>();
		int setSum = 0;

		for (int i = 0; i < A.length; i++) {
			if (set.add(A[i]))
				setSum += A[i];

			if (setSum == sum) {
				return i;
			}

		}

		return -1;
	}

}
