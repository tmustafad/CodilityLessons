package com.codility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TapeEquilibrium {

	public static void main(String[] args) {

		// left -right(inclusive)

		int[] arr = { 3, 1, 2, 4, 3 };

		System.out.println(solution(arr));

	}

	public static int solution(int[] A) {
		int totalLeft = 0;
		int totalRight = 0;
		int total = 0;
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			total += A[i];
		}

		for (int i = 0; i < A.length - 1; i++) {

			totalRight = total - (A[i] + totalLeft);
			totalLeft += A[i];

			result = Math.abs(totalLeft - totalRight);

			map.put(i, result);
			

		}

		
		return Collections.min(map.values());

	}

}
