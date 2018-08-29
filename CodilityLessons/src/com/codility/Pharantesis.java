package com.codility;

import java.util.LinkedList;
import java.util.Queue;

public class Pharantesis {

	public static void main(String[] args) {
		String s1 = "(()(())())";
		String s2 = "())";
		System.out.println(solution(s1));
	}

	public static int solution(String S) {

		char[] arr = S.toCharArray();

		int openCount = 0, closedCount = 0;

		Queue<Character> chars = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == ')')
				chars.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			if (!chars.isEmpty()) {
				char tmp =chars.poll();
				
				if(i == 0 && tmp ==')') {
					closedCount =-1;
					break;
				}
					

				if (tmp == '(')
					openCount++;

				if (tmp == ')') {
					if (closedCount < openCount)
						closedCount++;
					else {
						closedCount = -1;
						break;
					}

				}

			}

		}

		if (closedCount < 0)
			return 0;

		if (openCount != closedCount)
			return 0;
		else
			return 1;
	}

}
