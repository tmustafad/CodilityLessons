package com.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;

public class MissingInteger {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };// should return 4

		int arr1[] = { 4, 5, 6, 2 }; // should return 1
		int arr2[] = { 1, 3, 6, 4, 1, 2, 5, 11 }; // should return 7
		int arr3[] = { -1, 1, 2, 3 };
		int arr4[] = { 4 };
		System.out.println(solution3(arr1));

	}

	public static int solution3(int[] A) {
		int missing = 1;

		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {

			if (A[i] == missing)
				missing += 1;
			if (A[i] > missing)
				break;
		}
		return missing;
	}

	public static int solution2(int[] A) {// %88
		IntPredicate p1 = i -> i < 0;
		IntPredicate p2 = k -> k == 1;

		boolean hasNegative = Arrays.stream(A).anyMatch(p1);
		boolean hasOne = Arrays.stream(A).anyMatch(p2);
		boolean single = A.length == 1 ? true : false;

		if (single && !hasOne)
			return 1;
		else if (single && hasOne)
			return A[0] + 1;

		if (hasNegative && !hasOne)
			return 1;

		if (!hasNegative && !hasOne)
			return 1;

		Arrays.sort(A);
		for (int j = 0; j < A.length - 1; j++) {
			if (A[j + 1] - A[j] != 1 && A[j + 1] - A[j] != 0) {
				if (A[j] + 1 > 0)
					return A[j] + 1;
			}

		}

		return A[A.length - 1] + 1;

	}

	public static int solution(int[] A) {// %55
		IntPredicate p1 = i -> i < 0;
		IntPredicate p2 = k -> k == 1;

		boolean hasNegative = Arrays.stream(A).anyMatch(p1);
		boolean hasOne = Arrays.stream(A).anyMatch(p2);

		if (hasNegative || !hasOne)
			return 1;

		Set<Integer> set = new HashSet<Integer>();
		int max = Arrays.stream(A).max().getAsInt();
		int sum = max * (max + 1) / 2;
		int actualSum = 0;
		for (int j = 0; j < A.length; j++) {
			if (set.add(A[j]))
				actualSum += A[j];
		}

		if (sum - actualSum == 0)
			return max + 1;
		else
			return sum - actualSum;

	}
}
