package com.codility;

public class CyclicRotation {

	public static void main(String[] args) {
		
		int[] arr = {};

		int[] arr1 = solution(arr, 0);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}

	public static int[] solution(int[] A, int K) {
		
		if(A.length == 0)
			return new int[]{};
		
		if(A.length==1)
			return A;
		
		int[] retVal = new int[A.length];
		int l = A.length;
		if(l<K)
			K=K%l;
		
		for (int j = 0; j < A.length; j++) {
			if (j + K > l-1)
				retVal[j + K - l] = A[j];
			else
				retVal[j + K] = A[j];
		}
		
		return retVal;
	}

}
