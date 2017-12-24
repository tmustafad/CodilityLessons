package com.codility;

public class FrogJump {

	// X = 10
	// Y = 85
	// D = 30

	public static void main(String[] args) {
		System.out.println(solution(10,85,30));
	}

	public static int solution(int X, int Y, int D) {

		if (X == Y)
			return 0;

		if ((Y - X) % D > 0)
			return ((Y - X) / D) + 1;
		else
			return ((Y - X) / D);

	}

}
