package com.codility;

import java.util.Arrays;


public class MaxCounters {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 4, 6, 1, 4, 4 };
		int arr1[] = { 3, 3, 3, 3, 3, 3 };
		int[] counters = solution3(5, arr);
		for (int i = 0; i < counters.length; i++) {
			System.out.println(counters[i]);
		}

	}

	public static int[] solution1(int N, int[] A) {// %44

		int[] counters = new int[N];

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				counters[A[i] - 1] = counters[A[i] - 1] + 1;
			}

			if (A[i] == N + 1) {
				int max = Arrays.stream(counters).max().getAsInt();

				for (int j = 0; j < counters.length; j++) {
					counters[j] = max;
				}
			}

		}

		return counters;

	}

	public int[] solution2(int N, int[] A) {
		int[] counters = new int[N];

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				counters[A[i] - 1] = counters[A[i] - 1] + 1;
			}

			if (A[i] == N + 1) {
				int max = Arrays.stream(counters).max().getAsInt();

				for (int j = 0; j < counters.length; j++) {
					counters[j] = max;
				}
			}

		}

		return counters;
	}
	
	

	public static int[] solution3(int N, int[] A) {//%100
		int[] counters = new int[N];
		int max = 0;
		int current = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == N + 1) {
				current = max;
			} else if ( A[i] <= N) {
				counters[A[i] - 1] = counters[A[i] - 1] > current ? counters[A[i] - 1] + 1
						: current + 1;
				if (max <= counters[A[i] - 1])
					max = counters[A[i] - 1];
			}

		}
		for (int j = 0; j < counters.length; j++) {
			if (counters[j] < current)
				counters[j] = current;
		}

		return counters;
	}
}
