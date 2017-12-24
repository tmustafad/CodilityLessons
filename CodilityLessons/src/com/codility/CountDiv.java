package com.codility;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2));
	}

	public  static int solution(int A, int B, int K) {
		
		int b=B/K;
		int a=(A-1)/K;
		
		return b-a;
		
	}

}
