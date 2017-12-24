package com.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		int P[] = { 2, 5, 0 };
		int Q[] = { 4, 5, 6 };
//		int[] result = solution("CAGCCTA", P, Q);

//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
	}

//	public static int[] solution(String S, int[] P, int[] Q) { // %37
//
//		Map<Integer, String> factorMap = new HashMap<Integer, String>();
//		factorMap.put(1,"A");
//		factorMap.put(2,"B");
//		factorMap.put(3,"C");
//		factorMap.put(4,"D");
//		int[] retVal = new int[P.length];
//
//		char arr[] = S.toCharArray();
//
//	
//	}

	// P[0] = 2 Q[0] = 4
	// P[1] = 5 Q[1] = 5
	// P[2] = 0 Q[2] = 6



	private static int getMinSubArray(int[] paramArr) {

		if (paramArr.length > 2) {
			int min = paramArr[0], minCurrent = paramArr[0];
			for (int i = 0; i < paramArr.length - 1; i++) {
				minCurrent = paramArr[i] < minCurrent - paramArr[i] ? paramArr[i] : minCurrent - paramArr[i];
				min = minCurrent < min ? minCurrent : min;
			}
			return min;
		} else {
			return paramArr.length < 1 ? paramArr[0] < paramArr[1] ? paramArr[0] : paramArr[1] : paramArr[0];
		}

	}

}
